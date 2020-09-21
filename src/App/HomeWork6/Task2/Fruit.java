package App.HomeWork6.Task2;

import java.util.Arrays;

public class Fruit<E> {
    private E nameFruit;
    private Object[] Fruit = new Object[0];

    public void print() {
        System.out.println(Arrays.toString(Fruit));
    }
}