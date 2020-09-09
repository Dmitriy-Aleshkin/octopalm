package App.HomeWork3;
import java.util.Scanner;
//Создаем класс Phone
public class Phone {
    int number;
    String model;
    int weight;
    //Имя звонящего
    String name = "Osho";

    //Вводим данные по номеру/весу
    static int getNumb() {
        Scanner Num = new Scanner(System.in);
        return Num.nextInt();
    }
    //Вводим данные по модели
    static String getStr() {
        Scanner Str = new Scanner(System.in);
        return Str.nextLine();
    }

    public static void main(String[] args) {
        //Создали экземпляры класса Phone
        /*
        Phone Samsung = new Phone(1, "Galaxy", 4);
        Phone iPhone = new Phone(2, "ProMax", 5);
        Phone Nokia = new Phone(3, "3310");
        */
        Phone Samsung = new Phone();
        Phone iPhone = new Phone();
        Phone Nokia = new Phone();
        //Вводим данные
        System.out.print("Введите номер 1-го телефона: ");
        Samsung.number = getNumb();
        System.out.print("Введите его модель: ");
        Samsung.model = getStr();
        System.out.print("Вес: ");
        Samsung.weight = getNumb();
        System.out.print("Введите номер 2-го телефона: ");
        iPhone.number = getNumb();
        System.out.print("Введите его модель: ");
        iPhone.model = getStr();
        System.out.print("Вес: ");
        iPhone.weight = getNumb();
        System.out.print("Введите номер 3-го телефона: ");
        Nokia.number = getNumb();
        System.out.print("Введите его модель: ");
        Nokia.model = getStr();
        System.out.print("Вес: ");
        Nokia.weight = getNumb();
        //Вывели экземпляры на консоль
        System.out.println("Телефон - " + Samsung.model + " " + "Номер - " + Samsung.number + " " + "Вес смартфона - " + Samsung.weight);
        System.out.println("Телефон - " + iPhone.model + " " + "Номер - " + iPhone.number + " " + "Вес смартфона - " + iPhone.weight);
        System.out.println("Телефон - " + Nokia.model + " " + "Номер - " + Nokia.number + " " + "Вес смартфона - " + Nokia.weight);
        //Вызвали методы receiveCall и getNumber для всех экземпляров
        Samsung.getNumber();
        Samsung.receiveCall();
        iPhone.getNumber();
        iPhone.receiveCall();
        Nokia.getNumber();
        Nokia.receiveCall();
        //Вызвали перегруженный метод receiveCall
        Samsung.receiveCall(Samsung.name, Samsung.number);
        iPhone.receiveCall(iPhone.name, iPhone.number);
        Nokia.receiveCall(Nokia.name, Nokia.number);
        //Вызвали метод sendMessage
        Nokia.sendMessage(Samsung.number, Nokia.number);
    }

    //Добавили метод receiveCall
    public void receiveCall() {
        System.out.println("Звонит абонент " + name);
    }

    //Добавили метод getNumber
    public void getNumber() {
        System.out.println("Входящий вызов с номера " + number);
    }

    //Конструктор c 3 параметрами и вызовом конструктора с двумя параметрами
    public Phone(int myNumber, String myModel, int myWeight) {
        this(myNumber, myModel);
        number = myNumber;
        model = myModel;
        weight = myWeight;
    }

    //Конструктор с 2 параметрами
    public Phone(int myNumber, String myModel) {
        number = myNumber;
        model = myModel;
    }

    //Конструктор без параметров
    public Phone() {

    }

    //Перегруженный метод receiveCall, который принимает два параметра (имя звонящего и номер телефона)
    public void receiveCall(String name, int num) {
        System.out.println("Звонит " + name + " " + num);
    }

    //Метод sendMessage
    public void sendMessage(int num1, int num2) {
        System.out.println(num1 + " " + num2);
    }
}