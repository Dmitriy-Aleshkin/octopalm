package App.homework2;
import java.util.Arrays;
import java.util.Collections;

public class Task8 {
    public static void main(String[] args) {
        Integer[] massiv = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(massiv, Collections.reverseOrder());
        int sumpol = 0;
        int sumchetot = 0;
        double sumot = 0;
        int countpol = 0;
        int countotr = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > 0) {
                sumpol += massiv[i];
                countpol++;
            } if (massiv[i] < -0 & massiv[i] % 2 == 0) {
                sumchetot = sumchetot + massiv[i];
            }
            if (massiv[i] < 0) {
                sumot = sumot + massiv[i];
                countotr++;
            }
        }
        System.out.println("Максимальное значение " + massiv[0]);
        System.out.println("Сумма положительных элементов "+sumpol);
        System.out.println("Сумма четных отрицательных элементов "+sumchetot);
        System.out.println("Количетво положительных элементов "+countpol);
        System.out.println("Среднее арифметическое отрицательных элементов "+(sumot / countotr));
        }
    }