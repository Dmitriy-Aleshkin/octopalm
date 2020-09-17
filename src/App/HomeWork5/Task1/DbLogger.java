package App.HomeWork5.Task1;

public class DbLogger extends Logger {
    @Override
    public CreateLog log(String message) {
        return new DataBase();
    }
}
