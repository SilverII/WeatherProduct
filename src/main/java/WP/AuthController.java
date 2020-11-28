package WP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
    private String result;

    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String Auth(){
       //тут код запроса к бд и проверка пары лог/пасс

        return result;
    }
}
