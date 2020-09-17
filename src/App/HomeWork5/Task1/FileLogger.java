package App.HomeWork5.Task1;

public class FileLogger extends Logger {
    @Override
    public CreateLog log(String message) {
        return new File();
    }
}
