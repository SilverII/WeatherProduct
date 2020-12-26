package project.WP;

import java.util.ArrayList;
import java.util.List;

//список городов и источников даты
//только чтение, чтобы отображать юзеру выбор
public class Resourses {
    List<String> Cities = new ArrayList<String>();
    List<String> Sources = new ArrayList<String>();

    private void setCities(){
        Cities.add("MSK");
        Cities.add("SPB");
        Cities.add("EKB");
    }

    private void setSources(){
        Sources.add("link1");
        Sources.add("link2");
    }

    public List getCities() {
        setCities();
        return Cities;
    }

    public List getSources() {
        setSources();
        return Sources;
    }
}
