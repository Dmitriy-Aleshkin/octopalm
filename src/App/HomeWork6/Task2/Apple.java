package App.HomeWork6.Task2;

import java.util.Arrays;

public class Apple<T> extends Fruit {
    private Object[] Apple = new Object[0];
    private T nameFruit;
    public Apple(T nameFruit) {

    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(Apple));
    }
}