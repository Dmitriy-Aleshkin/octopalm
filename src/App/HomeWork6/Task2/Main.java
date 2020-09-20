package App.HomeWork6.Task2;

public class Main {
    public static void main(String[] args) {
        Apple<String> app1 = new Apple<>("AppleOne");
        Apple<String> app2 = new Apple<>("AppleTwo");
        Orange<String> or1 = new Orange<>("OrangeOne");
        Orange<String> or2 = new Orange<>("OrangeTwo");
        Orange<String> or3 = new Orange<>("OrangeThree");
        Box box1 = new Box<>();
        box1.add(app1);
        box1.add(app2);
        box1.add(or2);
        Box box2 = new Box<>();
        box2.add(or1);
        box2.add(or2);
        Box box3 = new Box();
        box3.add(or3);
        box3.add(or1);
        box1.print();
        box2.print();
        box3.print();
        System.out.println("Вес коробки:" + " " + box1.getWeight());
        System.out.println("Вес коробки:" + " " + box2.getWeight());
        System.out.println(box3.compare(box2));
        box1.print();
        box2.print();
        box3.print();
    }
}
