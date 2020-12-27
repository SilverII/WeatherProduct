package project.WP;

import java.util.ArrayList;
import java.util.List;

//список городов и источников даты
//только чтение, чтобы отображать юзеру выбор
public class Resourses {

    List<String[]> Sources = new ArrayList<String[]>();

    private void setSources(){
        String[] str1 = new String[]{"api.openweathermap.org/data/2.5/weather?id=","&appid=18dc867da3ee24c0d9bbb6d86b6f9d34"};
        String[] str2 = new String[]{"api.openweathermap.org/data/2.5/weather?id=","&appid=18dc867da3ee24c0d9bbb6d86b6f9d34"};
        Sources.add(str1);
        Sources.add(str2);
    }

    public List getSources() {
        setSources();
        return Sources;
    }
}
