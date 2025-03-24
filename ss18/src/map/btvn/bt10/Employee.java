package map.btvn.bt10;

import java.util.Scanner;
import java.util.Scanner;

public class Employee {
    private static int idCounter = 1;
    private int id;
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.id = idCounter++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    public static Employee addEmployee(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        String name = sc.nextLine().trim();
        System.out.print("Nhập lương nhân viên: ");
        float salary = Float.parseFloat(sc.nextLine().trim());



        if (!name.isEmpty() && salary > 0) {
            return new Employee(name, salary);
        } else {
            System.out.println("Dữ liệu không hợp lệ! Lương phải > 0.");
            return null;
        }
    }

}

