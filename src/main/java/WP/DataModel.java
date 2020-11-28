package WP;

//структура бд
//можно будет вытягивать заданный город и источник по логину
//а так же сохранять изменения
public class DataModel {
    private String login;
    private String password;
    private String city;
    private String source;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
