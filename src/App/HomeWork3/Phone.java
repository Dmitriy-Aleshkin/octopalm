package App.HomeWork3;

import java.util.Scanner;

public class Phone {
    int number;
    String model;
    int weight;
    String name = "Osho";

    public static void main(String[] args) {
        Phone Samsung = new Phone();
        Samsung.number = 1;
        Samsung.model = "Galaxy";
        Samsung.weight = 4;

        Phone iPhone = new Phone();
        iPhone.number = 2;
        iPhone.model = "ProMax";
        iPhone.weight = 5;

        Phone Nokia = new Phone();
        Nokia.number = 3;
        Nokia.model = "3310";
        Nokia.weight = 6;

        System.out.println("Мой телефон - " + Samsung.model + "\n" + "Мой номер - " + Samsung.number + "\n" + "Вес смартфона - " + Samsung.weight);
        System.out.println("Мой телефон - " + iPhone.model + "\n" + "Мой номер - " + iPhone.number + "\n" + "Вес смартфона - " + iPhone.weight);
        System.out.println("Мой телефон - " + Nokia.model + "\n" + "Мой номер - " + Nokia.number + "\n" + "Вес смартфона - " + Nokia.weight);
    }
    public void getNumber() {
        System.out.println("Входящий вызов с номера "+number);
    }
    public void receiveCall() {
        System.out.println("Звонит абонент " + name);
    }
}
