package App.HomeWork6.Task2;

import java.util.Arrays;

public class Box<T> {
    private Object[] box = new Object[0];

    public void add(T item) {
        if ((box.length == 0)) {
            Object[] result = new Object[box.length + 1];
            System.arraycopy(box, 0, result, 0, box.length);
            result[box.length] = item;
            box = result;
        } else {
            if ((item instanceof Orange) & (box[0] instanceof Orange) | (item instanceof Apple) & (box[0] instanceof Apple)) {
                Object[] result = new Object[box.length + 1];
                System.arraycopy(box, 0, result, 0, box.length);
                result[box.length] = item;
                box = result;
            } else {
                System.out.println("Фрукты разные...");
            }
        }
    }

    public void print() {
        System.out.println(Arrays.toString(box));
    }

    public double getWeight() {
        double temp = 0;
        if (box.length == 0) {
            temp = 0;
        } else {
            if (box[0] instanceof Orange) {
                temp = (box.length * 1.5);
            } else {
                if (box[0] instanceof Apple) {
                    temp = (box.length);
                }
            }

        }
        return temp;
    }

    public boolean compare(Box underBox) {

        return (this.getWeight() == underBox.getWeight());
    }

}
