package App.HomeWork6.Task1;

import java.util.Arrays;

public class collectionArray<E> {
    private Object[] data = new Object[0];
    public int size() {
        return data.length;
    }

    public void add(E item) {
        Object[] result = new Object[data.length + 1];
        System.arraycopy(data, 0, result, 0, data.length);
        result[data.length] = item;
        data = result;
    }

    public void remove(int index) {
        Object[] result = new Object[data.length - 1];
        if (index - 1 < 0) {
        } else {
            System.arraycopy(data, 0, result, 0, index - 1);
        }
        if (data.length - index >= 0) System.arraycopy(data, index, result, index - 1, data.length - index);
        data = result;
    }

    public void remove(E item) {
        for (int i = 0; i < data.length; i++) {
            if (item == data[i]) {
                remove(i + 1);
            }
        }
    }

    public E get(int index) {
        return (E) data[index];

    }

    public void clear() {
        Arrays.fill(data, null);
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }
}