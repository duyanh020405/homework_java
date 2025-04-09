package bt2.modle;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    private String major;
    public Student(int id, String name, int age, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void inputData (Scanner scanner) {
        System.out.print("Enter name : ");
        this.name = scanner.nextLine();
        System.out.print("Enter age : ");
        this.age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter major : ");
        this.major = scanner.nextLine();

    }
}
