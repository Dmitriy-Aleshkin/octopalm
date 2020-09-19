package App.HomeWork6.Task1;

public class Main {
    public static void main(String[] args) {
        collectionArray<String> mAC = new collectionArray();
//watermelon plum peach mango
        System.out.println("Ниже будет вывод Array Collection");
        mAC.add("Watermelon");
        mAC.add("Plum");
        mAC.add("Mango");
        mAC.print();
        System.out.println(mAC.get(0));
        System.out.println(mAC.size());
        mAC.remove("Mango");
        mAC.print();
        mAC.clear();
        mAC.print();

        System.out.println("Ниже будет вывод List Collection");
        collectionList<String> Fruit = new collectionList<>();
        Fruit.add("Plum");
        Fruit.add("Watermelon");
        Fruit.add("Mango");
        Fruit.print();
        System.out.println(Fruit.size());
        Fruit.remove(1);
        Fruit.print();
        Fruit.remove("Watermelon");
        Fruit.print();
        System.out.println(Fruit.get(1));
        Fruit.clear();
        Fruit.add("Peach");
        Fruit.print();
    }
}