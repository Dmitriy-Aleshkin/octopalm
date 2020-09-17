package App.HomeWork5.Task1;

import java.util.Objects;
import java.util.Scanner;

import static App.HomeWork5.Task1.Type.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение:");
        double tempA, tempB;
        String input = sc.nextLine();
        String operand = "";

        try {
            input = input.replaceAll("\\s+", "");
            String[] strings = input.split("\\W", 2);
            int c = input.indexOf('+');
            if (c > -1) {
                strings = input.split("\\+", 2);
                operand = "+";
            }
            c = input.indexOf('-');
            if (c > -1) {
                strings = input.split("-", 2);
                operand = "-";
            }
            c = input.indexOf('*');
            if (c > -1) {
                strings = input.split("\\*", 2);//не работает без \\
                operand = "*";
            }
            c = input.indexOf('/');
            if (c > -1) {
                strings = input.split("/", 2);
                operand = "/";
            }
            tempA = Double.parseDouble(strings[0]);
            tempB = Double.parseDouble(strings[1]);

            System.out.println("Введите путь (DataBase, File или Console): ");
            Type type;
            try {type = valueOf(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ошибка: " + e);}
            type = valueOf(sc.nextLine());
            Logger logger = null;
            switch (Objects.requireNonNull(type)) {
                case DataBase:
                    logger = new DbLogger();
                    break;
                case File:
                    logger = new FileLogger();
                    break;
                case Console:
                    logger = new ConsoleLogger();
                    break;
                default:
            }

            switch (operand) {
                case "*":
                    Calculator.multiplication(tempA, tempB, logger);
                    break;
                case "+":
                    Calculator.add(tempA, tempB, logger);

                    break;
                case "-":
                    Calculator.minus(tempA, tempB, logger);

                    break;
                case "/":
                    Calculator.division(tempA, tempB, logger);

                    break;
                default:
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }

    }
}