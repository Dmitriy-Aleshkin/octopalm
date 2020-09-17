package App.HomeWork5.Task2.PC;


import App.HomeWork5.Task2.CPU.CPU;
import App.HomeWork5.Task2.CPU.CreateCPU;
import App.HomeWork5.Task2.GraphicCard.CreateGraphicCard;
import App.HomeWork5.Task2.GraphicCard.GraphicCard;
import App.HomeWork5.Task2.HDD.CreateHDD;
import App.HomeWork5.Task2.HDD.HDD;
import App.HomeWork5.Task2.Monitor.CreateMonitor;
import App.HomeWork5.Task2.Monitor.Monitor;
import App.HomeWork5.Task2.RAM.CreateRAM;
import App.HomeWork5.Task2.RAM.RAM;

import java.util.Scanner;

public class PC implements interfacePC {
    public static void main(String[] args) {

        CPU cpu;
        RAM ram;
        GraphicCard gc;
        HDD hdd;
        Monitor monitor;

        Strategy cpu1 = new Strategy();
        cpu1.setComponentsPC(new CPU());
        cpu1.createComponent();
        System.out.println("");

        FacadePC comp1 = new FacadePC();
        comp1.createPC();

        System.out.println("\n Вводите компонент для PC, который нужно создать:");
        Scanner sc = new Scanner(System.in);
        String component = sc.nextLine();
        FactoryComponents createprogram = null;
        switch (component) {
            case "CPU":
                createprogram = new CreateCPU();
                break;
            case "RAM":
                createprogram = new CreateRAM();
                break;
            case "GC":
                createprogram = new CreateGraphicCard();
                break;
            case "HDD":
                createprogram = new CreateHDD();
                break;
            case "Monitor":
                createprogram = new CreateMonitor();
                break;
            default:
                System.out.println("Компонент не найден");
        }
        if (createprogram != null) {
            ComponentsPC message = createprogram.createComponent();
            message.output();
        }
        PC pc=new PC();
    }
}