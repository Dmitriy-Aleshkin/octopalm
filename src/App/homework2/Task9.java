package App.homework2;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        Integer [] massiv = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        for (int i = 0;i < massiv.length/2; i++) {
            int tmp = massiv[i];
            massiv[i] = massiv[massiv.length - i - 1];
            massiv[massiv.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(massiv));
    }
}
