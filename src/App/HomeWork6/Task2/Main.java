package App.HomeWork6.Task2;

public class Main {
    public static void main(String[] args) {
        Apple<String> app1 = new Apple<>("AppleOne");
        Apple<String> app2 = new Apple<>("AppleTwo");
        Orange<String> or1 = new Orange<>("OrangeOne");
        Orange<String> or2 = new Orange<>("OrangeTwo");
        Orange<String> or3 = new Orange<>("OrangeThree");
        Box PalletOne = new Box<>();
        Box PalletTwo = new Box<>();
        PalletOne.add(app1);
        PalletOne.add(app2);
        PalletTwo.add(or1);
        PalletTwo.add(or2);
        PalletTwo.add(or3);
        PalletOne.getWeight();
        PalletTwo.getWeight();
        System.out.println("Вес паллеты: " + PalletOne.getWeight());
        System.out.println("Вес паллеты: " + PalletTwo.getWeight());
        System.out.println(PalletOne.compare(PalletTwo));
    }
}
