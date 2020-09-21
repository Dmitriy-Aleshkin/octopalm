package App.HomeWork6.Task2;

import java.util.Arrays;

public class Orange <T> extends Fruit {
    private T nameFruit;
    private Object[] Orange = new Object[0];
    public Orange(T nameFruit) {

    }
    @Override
    public void print (){
        System.out.println(Arrays.toString(Orange));
    }
}