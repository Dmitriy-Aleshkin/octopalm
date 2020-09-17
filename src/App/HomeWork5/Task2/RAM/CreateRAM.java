package App.HomeWork5.Task2.RAM;

import App.HomeWork5.Task2.PC.ComponentsPC;
import App.HomeWork5.Task2.PC.FactoryComponents;

public class CreateRAM implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new RAM();
    }
}
