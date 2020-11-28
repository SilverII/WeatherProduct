package WP;

import java.util.List;

//список городов и источников даты
//только чтение, чтобы отображать юзеру выбор
public class Resourses {
    private List Cities;
    private List Sources;

    public List getCities() {
        return Cities;
    }

    public List getSources() {
        return Sources;
    }
}
