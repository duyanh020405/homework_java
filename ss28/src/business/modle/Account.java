package business.modle;

import java.util.Scanner;

public class Account {
    private int id;
    private String name;
    private double balance;
    private AccountStatus status;

    public Account() {
    }

    public Account(int id, String name, double balance, AccountStatus status) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.status = status;
    }

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

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
    public void inputData(Scanner scanner) {
        System.out.print("Enter account name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter account balance: ");
        this.balance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter account status (active // inactive // blocked): ");
        String status = scanner.nextLine();
        if(status.equals("active")) {
            this.status = AccountStatus.ACTIVE;
        }
        else if(status.equals("inactive")) {
            this.status = AccountStatus.INACTIVE;
        }
        else if(status.equals("Blocked")) {
            this.status = AccountStatus.BLOCKED;
        }
        else {
            System.out.println("Invalid status");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", status=" + status +
                '}';
    }
}