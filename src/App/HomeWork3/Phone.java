package App.HomeWork3;

//Создаем класс Phone
public class Phone {
    int number;
    String model;
    int weight;
    //Имя звонящего
    String name = "Osho";

    public static void main(String[] args) {
        //Создали экземпляры класса Phone
        Phone Samsung = new Phone(1, "Galaxy", 4);
        Phone iPhone = new Phone(2, "ProMax", 5);
        Phone Nokia = new Phone(3, "3310");
        Phone Xiaomi = new Phone();
        //Вывели экземпляры на консоль
        System.out.println("Телефон - " + Samsung.model + "\n" + "Номер - " + Samsung.number + "\n" + "Вес смартфона - " + Samsung.weight);
        System.out.println("Телефон - " + iPhone.model + "\n" + "Номер - " + iPhone.number + "\n" + "Вес смартфона - " + iPhone.weight);
        System.out.println("Телефон - " + Nokia.model + "\n" + "Номер - " + Nokia.number + "\n" + "Вес смартфона - " + Nokia.weight);
        System.out.println("Телефон - " + Xiaomi.model + "\n" + "Номер - " + Xiaomi.number + "\n" + "Вес смартфона - " + Xiaomi.weight);
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
        Xiaomi.sendMessage(Samsung.number, Xiaomi.number);
    }

    //Добавили метод receiveCall
    public void receiveCall() {
        System.out.println("Звонит абонент " + name);
    }

    //Добавили метод getNymber
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

    //Консутор без параметров
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