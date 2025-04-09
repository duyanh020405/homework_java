package bt4.model;

import java.util.Scanner;

public class Account {
    int id;
    String name;
    double balance;
    String bank_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }
    public Account() {}
    public void inputData(Scanner scanner){
        System.out.print("Enter account name: ");
        this.name = scanner.next();
        System.out.print("Enter account balance: ");
        this.balance = scanner.nextDouble();
        System.out.print("Enter account bank name: ");
        this.bank_name = scanner.next();
    }
}
