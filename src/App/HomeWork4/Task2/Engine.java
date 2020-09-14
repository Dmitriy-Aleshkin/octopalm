package App.HomeWork4.Task2;

public class Engine {
    private String Manufacturer; //Произодитель
    private int Power; //Мощность

    public Engine(String Manufacturer, int Power) {
        this.Manufacturer = Manufacturer;
        this.Power = Power;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer() {
        this.Manufacturer = Manufacturer;
    }

    public int getPower() {
        return Power;
    }

    public void setPower() {
        this.Power = Power;
    }

    public String toString() {
        return "мощность двигателя: " + Power + ", " + "производитель двигателя: " + Manufacturer;
    }
}