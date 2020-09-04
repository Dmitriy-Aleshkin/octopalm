package App.homework2;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
