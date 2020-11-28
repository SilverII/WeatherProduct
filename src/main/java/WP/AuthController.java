package WP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
    private String result;

    //поменять возвращаемое значение на вью
    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String Auth(){
        //тут код запроса к бд и проверка пары лог/пасс
        //@RequestParam(value="login") String login, @RequestParam(value="password") String password

        //условие аутентификации
        //если ок, то redirect вью мэйн стр
        // если фолс, то возвращаем вью аутентификации с ошибкой
        return result;
    }
}
