package ss9;

import java.util.List;

import static ss9.bt9.*;

public class BankAccount {
    String name;
    int balance;
    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
}
