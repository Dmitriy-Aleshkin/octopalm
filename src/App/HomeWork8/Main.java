package App.HomeWork8;

import App.HomeWork7.NotEnoughMoneyException;
import App.HomeWork7.UnknownAccountException;

import java.sql.*;
import java.util.Scanner;

public class   Main {
    public static final String SELECT = "SELECT * FROM ACCOUNTS";
    private static final String address = "jdbc:h2:mem:test;INIT=RUNSCRIPT FROM './BaseForLesson8.sql'\\;RUNSCRIPT FROM './DataForLesson8.sql'";

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection(address);
             Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery(SELECT);
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT);
            AccountService accountService = new AccountService(connection, statement, preparedStatement, resultSet);
            accountService.printBase();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Какую банковскую операцию хотите произвести: (Or enter exit to exit)");
                String input = sc.nextLine();
                if (input.equals("exit")){
                    break;}
                String[] arr = input.split(" ");
                try {
                    switch (arr[0]) {
                        case "balance":
                            accountService.balance(Integer.valueOf(arr[1]));
                            break;
                        case "withdraw":
                            accountService.withdraw(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
                            break;
                        case "deposite":
                            accountService.deposit(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]));
                            break;
                        case "transfer":
                            accountService.transfer(Integer.valueOf(arr[1]), Integer.valueOf(arr[2]), Integer.valueOf(arr[3]));
                        default:
                            System.out.println("Неизвестная операция");
                            break;
                    }

                } catch (ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                } catch (UnknownAccountException e) {
                    e.printStackTrace();
                } catch (NotEnoughMoneyException e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}