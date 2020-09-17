package App.HomeWork5.Task1;

public class Calculator {
    public static void add(double tempA, double tempB, Logger logger) {
        if (logger != null) {

            CreateLog exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (tempA + tempB));
        }
    }

    public static void minus(double tempA, double tempB, Logger logger) {
        if (logger != null) {

            CreateLog exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (tempA - tempB));
        }
    }

    public static void multiplication(double tempA, double tempB, Logger logger) {
        if (logger != null) {

            CreateLog exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (tempA * tempB));
        }
    }

    public static void division(double tempA, double tempB, Logger logger) {
        if (logger != null) {

            CreateLog exit = logger.log("");
            exit.createlog();
            System.out.println(" " + (tempA / tempB));
        }
    }
}