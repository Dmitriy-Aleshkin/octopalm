package App.homework2;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] massiv = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int temp;
        int count = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] != 0) {
                temp = massiv[count];
                massiv[count] = massiv[i];
                massiv[i] = temp;
                count = count + 1;
            }
        }
        System.out.println(Arrays.toString(massiv));
    }
}
