package business.model;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private boolean status;
    public Student(int id, String name, int age, boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public Student() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void inputData(Scanner scanner) {
        System.out.println("Enter name:");
        setName(scanner.nextLine());

        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        setAge(age);

        System.out.println("Enter status (true/false):");
        boolean status = Boolean.parseBoolean(scanner.nextLine());
        setStatus(status);
    }


    public String toString(){
        return "id: " + id + ", name: " + name + ", age: " + age + ", status: " + status;
    }
}
