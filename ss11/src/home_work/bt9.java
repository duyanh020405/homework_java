package home_work;

import java.util.ArrayList;

public class bt9 {
abstract class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    abstract void displayBalance();
}

class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("So du khong du , hay thu lai");
        } else {
            balance -= amount;
            System.out.println("Rut" + amount + " thanh cong.");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Da nap " + amount + " vao tk .");
    }

    @Override
    void displayBalance() {
        System.out.println("So du tai khoan tiet kiem : " + balance);
    }
}

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("da rut " + amount + " tu tai khoan");
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("da nap " + amount);
    }

    @Override
    void displayBalance() {
        System.out.println("so du tai khoan: " + balance);
    }
}

class Bank {
    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        if (accounts.size() < 10) {
            accounts.add(account);
        } else {
            System.out.println("Gioi han tai khoan");
        }
    }

    public void displayAllBalances() {
        for (BankAccount account : accounts) {
            account.displayBalance();
        }
    }
}

    public void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount saving = new SavingAccount("123456", 5000);
        CheckingAccount checking = new CheckingAccount("654321", 1000);

        bank.addAccount(saving);
        bank.addAccount(checking);

        saving.deposit(22000);
        saving.withdraw(2000);
        checking.withdraw(1500);
        checking.deposit(500);

        bank.displayAllBalances();
    }
}