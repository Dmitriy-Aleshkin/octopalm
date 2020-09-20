package App.HomeWork6.Task2;

import java.util.Arrays;

public class Orange <T> extends Fruit{
    private T nameFruit;
    public Orange(T nameFruit) {
    }
    private Object[] box = new Object[0];
    @Override
    public void print (){
        System.out.println(Arrays.toString(box));
    }
}