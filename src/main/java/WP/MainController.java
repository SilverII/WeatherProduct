package WP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    private String view;

    //принимать логин с аутентификации
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String MainV(){
        //по логину искать город и сурс

        return view;
    }

    @RequestMapping(value = "/changeSetup", method = RequestMethod.GET)
    public String changeSetup(){
        //из листа вытягивать доступные варианты
        //и отображать их

        return view;
    }

    @RequestMapping(value = "/changeSetup", method = RequestMethod.POST)
    public String changeApprove(){
        //записывать в бд изменения дефолтных города и сервиса
        //@RequestParam(value="login") String login, @RequestParam(value="password") String password

        //возвращать мэйн вью с новыми данными
        return view;
    }
}
