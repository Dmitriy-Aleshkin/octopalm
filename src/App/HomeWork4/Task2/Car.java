package App.HomeWork4.Task2;
//марка автомобиля, класс автомобиля, вес, мотор типа Engine.
//абсстрактный класс Car
public abstract class Car {
    public String Model;
    public String modelClass;
    public double Weight;
    public Engine engine;

    public Car(String Model, String modelClass, double weight, Engine engine) {
        this.Model = Model;
        this.modelClass = modelClass;
        this.Weight = weight;
        this.engine = engine;
    }
    //получить Model
    public String getModel() {
        return Model;
    }
    //выдать Model
    public void setModel(String Model) {
        this.Model = Model;
    }
    //получить modelClass
    public String getmodelClass() {
        return modelClass;
    }
    //выдать modelClass
    public void setmodelClass(String modelClass) {
        this.modelClass = modelClass;
    }
    //получить Weight
    public double getWeight() {
        return Weight;
    }
    //выдать Weight
    public void setWeight(double Weight) {
        this.Weight = Weight;
    }
    //получить Engine
    public Engine getEngine() {
        return engine;
    }
    //выдать Engine
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    //Абстрактный метод Start
    public abstract void start();
    //Абстрактный метод Stop
    public abstract void stop();
    //Метод turnRight
    public void turnRight() {
        System.out.println("Поворот направо");
    }
    //Метод turnLeft
    public void turnLeft() {
        System.out.println("Поворот налево");
    }
    //Абстрактный метод printInfo(), который выводит полную информацию об автомобиле, и моторе
    public abstract void printInfo();
}