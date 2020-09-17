package App.HomeWork5.Task1;

public class ConsoleLogger extends Logger {
    @Override
    public CreateLog log(String message) {
        return new Console();
    }
}
