package App.HomeWork4.Task2;
//Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузов,
// реализовать методы start(), stop(). Метод start – выводит на экран «Грузовик поехал»,
// метод stop -   «грузовик остановился».
public class Lorry extends Car {
    double Carrying; //Грузоподъемность
    public Lorry(String Model, String modelClass, double weight, Engine engine, double Carrying) {
        super(Model, modelClass, weight, engine);
        this.Carrying = Carrying;
    }
    public double getCarrying() {
        return Carrying;
    }
    public void setCarrying() {
        this.Carrying = Carrying;
    }
    @Override
    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    @Override
    public void start() {
    System.out.println("Грузовик поехал!");
    }

    @Override
    public void stop() {
    System.out.println("Грузовик остановился!");
    }

    @Override
    public void printInfo() {
    System.out.println("Модель: " + Model + ", " + "класс: " + modelClass + ", " + "вес: " +  Weight + ", " + engine + ", " + "грузоподъемность: " + Carrying);
    }
}