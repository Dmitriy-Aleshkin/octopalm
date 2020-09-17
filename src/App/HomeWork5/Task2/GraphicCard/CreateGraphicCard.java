package App.HomeWork5.Task2.GraphicCard;

import App.HomeWork5.Task2.PC.ComponentsPC;
import App.HomeWork5.Task2.PC.FactoryComponents;

public class CreateGraphicCard implements FactoryComponents {
    @Override
    public ComponentsPC createComponent() {
        return new GraphicCard();
    }
}
