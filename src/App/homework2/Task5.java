package App.homework2;
import java.util.Arrays;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = scanner.nextInt();
        int[] mas = {num1, num2, num3};
        Arrays.sort(mas);
            System.out.println(mas[0]);
    }
}

