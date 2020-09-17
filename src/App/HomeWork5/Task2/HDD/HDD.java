package App.HomeWork5.Task2.HDD;

import App.HomeWork5.Task2.PC.ComponentsPC;
import App.HomeWork5.Task2.PC.PC;

public class HDD extends PC implements ComponentsPC {
    private String manufacturer;
    private int size;
    TypeHdd typeHDD;
    FormFactorHDD formFactorHDD;

    public void setHDD(String manufacturer, int size, TypeHdd typeHDD, FormFactorHDD formFactorHDD) {
        this.manufacturer = manufacturer;
        this.size = size;
        this.typeHDD = typeHDD;
        this.formFactorHDD = formFactorHDD;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                ", typeHDD=" + typeHDD +
                ", formFactorHDD=" + formFactorHDD +
                '}';
    }

    @Override
    public void output() {
        System.out.println(toString());
    }
}
