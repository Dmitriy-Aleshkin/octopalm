package App.homework2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 905) {System.out.println("Москва."+"Стоимость разговора "+4.15*10+" руб.");}
        else if (num == 194) {System.out.println("Ростов."+"Стоимость разговора "+1.98*10+" руб.");}
        else if (num == 491) {System.out.println("Краснодар."+"Стоимость разговора "+2.36*10+" руб.");}
        else if (num == 800) {System.out.println("Киров."+"Стоимость разговора "+5.00*10+" руб.");}
        else  {System.out.println("Указанный код города не найден! Пожалуйста, обратитесь в поддержку.");}
    }
}
