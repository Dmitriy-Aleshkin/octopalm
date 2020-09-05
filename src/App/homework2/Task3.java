package App.homework2;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = num+1;
        if (num > 0) {
            System.out.println(i);
        } else if (num < 0) {System.out.println(num);
    }
}
}