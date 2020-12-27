package project.WP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class MainController {
    @Autowired
    private dbservice dbservice;
    /*private Long ids;
    private String login;*/

    //принимать логин с аутентификации
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView MainV(Long id){
        ModelAndView view = new ModelAndView("index");
        //ids = id;

        //по логину искать город и сурс
        List<String[]> gs = new Resourses().getSources();
        datamodel user = dbservice.get(id);
        String city = user.getCity();
        String provider = user.getSource();
        //login = user.getLogin();
        if (provider.contentEquals("link1")) {provider = gs.get(1)[1]+city+gs.get(1)[2];}
        if (provider.contentEquals("link2")) {provider = gs.get(2)[1]+city+gs.get(2)[2];}

        //запрос по апи к сервису
        RestTemplate rt = new RestTemplate();
        jsonValue api_results = rt.getForObject(provider, jsonValue.class);

        //добавление в вью
        view.addObject("temp", api_results.getMain().getTemp());
        view.addObject("wind_speed", api_results.getWind().getSpeed());
        view.addObject("pressure", api_results.getMain().getPressure());
        view.addObject("city",city);
        view.addObject("login",user.getLogin());

        return view;
    }

    @RequestMapping(value = "/changeSetup", method = RequestMethod.GET)
    public ModelAndView changeSetup(){

        //создание списков настройки
        ModelAndView view = new ModelAndView("settings");
        List<String> gcities = new ArrayList<String>();
        gcities.add("MSK");
        gcities.add("SPB");
        gcities.add("EKB");
        List<String> gsources = new ArrayList<String>();
        gsources.add("link1");
        gsources.add("link2");
        view.addObject("gc", gcities);
        view.addObject("gs", gsources);

        return view;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String changeApprove(@ModelAttribute("datamodel") datamodel dm){
        if (dm.getCity().contentEquals("MSK")) {dm.setCity("524894");}
        if (dm.getCity().contentEquals("SPB")) {dm.setCity("498817");}
        if (dm.getCity().contentEquals("EKB")) {dm.setCity("1486209");}

        /*dm.setId(ids);
        dm.setLogin(login);*/

        //записывать в бд изменения дефолтных города и сервиса
        dbservice.save(dm);

        return "redirect:/";
    }
}
