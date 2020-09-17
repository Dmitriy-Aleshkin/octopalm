package App.HomeWork5.Task2.PC;

public class Strategy {
    ComponentsPC componentsPC;

    public void setComponentsPC(ComponentsPC componentsPC) {
        this.componentsPC = componentsPC;
    }

    public void createComponent() {
        componentsPC.output();
    }
}
