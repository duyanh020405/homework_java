package btvn.bt10;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public String getClassification() {
        if (gpa >= 8.5) return "Xuất sắc";
        else if (gpa >= 7.0) return "Giỏi";
        else if (gpa >= 5.5) return "Khá";
        else return "Trung bình/Yếu";
    }

    @Override
    public String toString() {
        return "Mã SV: " + id + " | Họ tên: " + name + " | GPA: " + gpa + " | Xếp loại: " + getClassification();
    }
}
