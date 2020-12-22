package WP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Convert;
import java.util.List;

@Controller
public class AuthController {
    private ModelAndView AuthView;
    //String[] lgpw;
    Long id;

    @Autowired
    private dbservice dbservice;

    //поменять возвращаемое значение на вью
    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public ModelAndView Auth(@ModelAttribute("lgpwmodel") lgpwmodel lgpw){
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
            AuthView = new ModelAndView("/err");
            return AuthView;
        }
    }
}
