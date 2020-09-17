package App.HomeWork5.Task2.HDD;

import App.HomeWork5.Task2.PC.ComponentsPC;
import App.HomeWork5.Task2.PC.FactoryComponents;

public class CreateHDD implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new HDD();
    }
}
