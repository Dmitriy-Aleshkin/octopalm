package App.HomeWork7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownAccountException, NotEnoughMoneyException, IOException {
        File file = new File("C:/Project/AccountsBase.txt");
        AccountService accountService = new AccountService(file);
        accountService.writeAccounts();

        Scanner sc = new Scanner(System.in);
        System.out.println("Какую банковскую операцию хотите произвести: ");
        String input = sc.nextLine();
        String[] arr = input.split(" ");
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
        accountService.printAll();
    }
}