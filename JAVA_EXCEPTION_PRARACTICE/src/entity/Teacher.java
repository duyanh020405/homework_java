package entity;

import java.util.Scanner;

public class Teacher extends Person {
    int auto =0 ;
    private int teacherId;
    private String subject;

    public Teacher(String name, int age, String address, String phone, String email, int teacherId, String subject) {
        super(name, age, address, phone, email);
        this.teacherId = ++auto;
        this.subject = subject;
    }

    public Teacher() {
        super("", 0, "", "", "");
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void inputData(Scanner scanner) {
        super.inputData(scanner);
        System.out.print("Enter subject: ");
        this.subject = scanner.nextLine().trim();
    }
}
