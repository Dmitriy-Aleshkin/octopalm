package App.HomeWork5.Task2.CPU;

import App.HomeWork5.Task2.PC.ComponentsPC;
import App.HomeWork5.Task2.PC.FactoryComponents;

public class CreateCPU implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new CPU();
    }
}