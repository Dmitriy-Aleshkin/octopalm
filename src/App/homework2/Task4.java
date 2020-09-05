package App.homework2;

/*Ввести целое число в консоли. Если оно является
        положительным, то прибавить к нему 1; если
        отрицательным, то вычесть из него 2; если нулевым,
        то заменить его на 10. Вывести полученное число*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int q = num + 1;
        int w = num - 2;
        int e = 10;
        if (num > 0) {
            System.out.println(q);
        } else if (num < 0) {
            System.out.println(w);
        } else if (num == 0) {System.out.println(e);}
    }
}