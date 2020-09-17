package App.HomeWork5.Task2.PC;

import App.HomeWork5.Task2.CPU.CPU;
import App.HomeWork5.Task2.GraphicCard.GraphicCard;
import App.HomeWork5.Task2.HDD.HDD;
import App.HomeWork5.Task2.Monitor.Monitor;
import App.HomeWork5.Task2.RAM.RAM;

public class FacadePC {
    CPU cpu = new CPU();
    RAM ram = new RAM();
    GraphicCard gc = new GraphicCard();
    HDD hdd = new HDD();
    Monitor monitor = new Monitor();

    public void createPC() {
        cpu.output();
        ram.output();
        gc.output();
        hdd.output();
        monitor.output();
    }
}
