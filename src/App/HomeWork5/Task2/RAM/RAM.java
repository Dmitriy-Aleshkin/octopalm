package App.HomeWork5.Task2.RAM;

import App.HomeWork5.Task2.PC.ComponentsPC;
import App.HomeWork5.Task2.PC.PC;

public class RAM extends PC implements ComponentsPC {
    private String manufacturer;
    private int size;
    private int clockFrequency;
    private TypeRAM typeRAM;

    public void setRAM(String manufacturer, int size, int clockFrequency, TypeRAM typeRAM) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.clockFrequency = clockFrequency;
        this.typeRAM = typeRAM;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", clockFrequency=" + clockFrequency +
                ", typeRAM=" + typeRAM +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
