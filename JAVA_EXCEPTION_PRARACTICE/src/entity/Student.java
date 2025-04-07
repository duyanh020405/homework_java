package entity;

import java.util.Scanner;

public class Student extends Person {
    String idStudent;
    double gpa;
    public Student(String name, int age, String address, String phone, String email , String idStudent, double gpa) {
        super(name, age, address, phone, email);
        this.idStudent = idStudent;
        this.gpa = gpa;
    }

    public Student() {
        super("",0 ,"","","");
    }

    public void inputData(Scanner scanner) {
        super.inputData(scanner);
        System.out.print("Enter id: ");
        this.idStudent = scanner.nextLine();
        System.out.print("Enter gpa: ");
        this.gpa = scanner.nextDouble();


    }

    public String getIdStudent() {
        return idStudent;
    }
    public String getStudentName() {
        return this.name;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
