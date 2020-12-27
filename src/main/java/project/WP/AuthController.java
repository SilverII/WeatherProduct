package project.WP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {
    private ModelAndView AuthView;
    Long id;

    @Autowired
    private dbservice dbservice;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String viewHome(){
        return "auth";
    }

    //поменять возвращаемое значение на вью
    @RequestMapping(value = "/authGo", method = RequestMethod.POST)
    public ModelAndView AuthGo(@ModelAttribute("lgpwmodel") lgpwmodel lgpw){
        String login = lgpw.getLogin();
        String password = lgpw.getPassword();
        id = dbservice.getIdByLogin(login);
        String pw = dbservice.searchPWbyLogin(login);

        //условие аутентификации
        if (password.contentEquals(pw)){
            //AuthView = new ModelAndView("/");
            MainController mc = new MainController();
            AuthView = mc.MainV(id);
            return AuthView;
        }
        else {
            AuthView = new ModelAndView("err");
            return AuthView;
        }
    }
}
