package App.HomeWork5.Task2.Monitor;

import App.HomeWork5.Task2.PC.ComponentsPC;
import App.HomeWork5.Task2.PC.FactoryComponents;

public class CreateMonitor implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new Monitor();
    }
}
