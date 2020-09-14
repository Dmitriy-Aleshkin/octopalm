package App.HomeWork4.Task2;
//Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью start(), stop().
// Метод start – выводит на экран «SportCar поехал», метод stop -  «SportCar остановился».
public class SportCar extends Car {
    public int maxPower;

    public SportCar(String Model, String modelClass, double weight, Engine engine, int maxPower) {
        super(Model, modelClass, weight, engine);
        this.maxPower = maxPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал!");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился!");
    }

    @Override
    public void printInfo() {
        System.out.println("Модель: " + Model + ", " + "класс: " + modelClass + ", " + "вес: " +  Weight + ", " + engine + ", " + "максимальная мощность: " + maxPower);
    }
}
