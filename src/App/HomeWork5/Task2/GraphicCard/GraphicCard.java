package App.HomeWork5.Task2.GraphicCard;

import App.HomeWork5.Task2.PC.ComponentPC;
import App.HomeWork5.Task2.PC.ComponentsPC;
import App.HomeWork5.Task2.PC.PC;

public class GraphicCard extends PC implements ComponentsPC {
    private String manufacturer;
    TypeRamGraphicCard typeRAMGC;
    private int size;
    CollingGraphicCard coolingGC;

    public void setGC(String manufacturer, TypeRamGraphicCard typeRAMGC, int size, CollingGraphicCard coolingGC) {
        this.manufacturer = manufacturer;
        this.typeRAMGC = typeRAMGC;
        this.size = size;
        this.coolingGC = coolingGC;
    }

    @Override
    public String toString() {
        return "GC{" +
                "manufacturer='" + manufacturer + '\'' +
                ", typeRAMGC=" + typeRAMGC +
                ", size=" + size +
                ", coolingGC=" + coolingGC +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}