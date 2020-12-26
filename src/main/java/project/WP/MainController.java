package project.WP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {
    private ModelAndView view;

    @Autowired
    private dbservice dbservice;

    //принимать логин с аутентификации
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView MainV(Long id){
        //по логину искать город и сурс
        datamodel user = dbservice.get(id);
        String city = user.getCity();
        String provider = user.getSource();

        //запрос по апи к сервису
        //парсинг жсон ответа
        //добавление в вью
        view.addObject("city", city);
        view.addObject("prov", provider);

        return view;
    }

    @RequestMapping(value = "/changeSetup", method = RequestMethod.GET)
    public ModelAndView changeSetup(){
        //из листа вытягивать доступные варианты
        //и отображать их
        Resourses rss = new Resourses();
        List<Resourses> gc = rss.getCities();
        List<Resourses> gs = rss.getSources();
        view.addObject("gc", gc);
        view.addObject("gs", gs);

        return view;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String changeApprove(@ModelAttribute("datamodel") datamodel dm){
        //записывать в бд изменения дефолтных города и сервиса
        dbservice.save(dm);

        return "redirect:/";
    }
}
