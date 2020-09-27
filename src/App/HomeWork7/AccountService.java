package App.HomeWork7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class AccountService {
    private File file;
    ArrayList<Account> accounts = new ArrayList<>();

    public AccountService (File file) {
        this.file = file;
    }

    public void withdraw(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        accounts.clear();
        writeAccounts();
        if (accountId > accounts.size()) {
            throw new UnknownAccountException("Unknown Account");
        } else {
            if (accounts.get(accountId).amount - amount < 0) {
                throw new NotEnoughMoneyException("Not Enough Money");

            } else {
                accounts.get(accountId).amount = accounts.get(accountId).amount - amount;
                PrintWriter pw = new PrintWriter(file);
                pw.close();
                recordAccount();
            }
        }
    }


    public void balance(int accountId) throws UnknownAccountException, IOException {
        accounts.clear();
        writeAccounts();
        if (accountId > accounts.size()) {
            throw new UnknownAccountException("Unknown Account");
        } else {
            System.out.println("Информация о счете №" + accounts.get(accountId).id + " " + accounts.get(accountId).amount);
        }
    }

    public void deposit(int accountId, int amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        accounts.clear();
        writeAccounts();
        if (accountId > accounts.size()) {
            throw new UnknownAccountException("Unknown Account");
        } else {
            if (accounts.get(accountId).amount - amount < 0) {
                throw new NotEnoughMoneyException("Not Enough Money");

            } else {
                accounts.get(accountId).amount = accounts.get(accountId).amount + amount;
                PrintWriter pw = new PrintWriter(file);
                pw.close();
                recordAccount();
            }
        }
    }

    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException, IOException {
        accounts.clear();
        writeAccounts();
        if (from > accounts.size() | to > accounts.size()) {
            throw new UnknownAccountException("Unknown Account");
        } else {
            if (accounts.get(from).amount - amount < 0) {
                throw new NotEnoughMoneyException("Not Enough Money");

            } else {
                accounts.get(from).amount = accounts.get(from).amount - amount;
                accounts.get(to).amount = accounts.get(to).amount + amount;
                PrintWriter pw = new PrintWriter(file);
                pw.close();
                recordAccount();
            }
        }
    }

    public void writeAccounts() throws IOException {
        FileWriter fr = null;
        String absolutePath = file.getAbsolutePath();
        if (file.length() == 0) {
            String str = "0|Василий К|1000\n" +
                    "1|Петр Д|500\n" +
                    "2|Валентина Григорьевна|12\n" +
                    "3|Дмитрий Медведев|2000000000\n" +
                    "4|Александр григорьевич|1500000000\n" +
                    "5|Алексей Н|3000000\n" +
                    "6|Евгений С|1\n" +
                    "7|Российская Федерация|2147483647\n" +
                    "8|Валентина Т|500000000\n" +
                    "9|Дмитрий Иванович|10000";
            try {
                Files.createFile(Paths.get(absolutePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr = new FileWriter(absolutePath);
                fr.write(str);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {
                    assert fr != null;
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
        String str;
        while ((str = reader.readLine()) != (null)) {
            String[] arr = str.split("\\|");
            Account temp = new Account(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]));
            accounts.add(temp);
        }
        reader.close();
    }


    public void printAll() {
        for (Account account : accounts) {
            System.out.println(account);
        }

    }

    public void recordAccount() {
        FileWriter fileWriter = null;
        String absolutePath = file.getAbsolutePath();
        try {
            fileWriter = new FileWriter(absolutePath, false);
            for (Account account : accounts) {
                fileWriter.write((account.toString()) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void recordAccountToBase(Account newAccount) { //добавить в базу новый аккаунт
        FileWriter fileWriter = null;
        String absolutePath = file.getAbsolutePath();
        try {
            fileWriter = new FileWriter(absolutePath, false);
            newAccount.id = accounts.size();
            accounts.add(newAccount);

            for (Account account : accounts) {
                fileWriter.write((account.toString()) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fileWriter != null;
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}