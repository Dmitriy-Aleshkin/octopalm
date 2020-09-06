package App.homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0 & num % 2 == 0) {
            System.out.println("Число четное положительное");
        } else if (num > 0 & num % 2 != 0) {
            System.out.println("Число нечетное положительное");
        } else if (num < -0 & num % 2 == 0) {
            System.out.println("Число четное отрицательное");
        } else if (num < -0 & num % 2 != 0) {
            System.out.println("Число нечетное отрицательное");
        } else if (num == 0) {
            System.out.println("Число нулевое ");
        }
    }
}
