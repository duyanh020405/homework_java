package hkt1_2.business;

import hkt1_2.entity.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class sortStudents {
    public static void sortStudentss(ArrayList<Student> students, int size, Scanner sc) {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }

        while (true) {
            System.out.println("\n===== MENU SẮP XẾP =====");
            System.out.println("1. Sắp xếp theo tên (Tăng dần)");
            System.out.println("2. Sắp xếp theo tên (Giảm dần)");
            System.out.println("3. Sắp xếp theo GPA (Tăng dần)");
            System.out.println("4. Sắp xếp theo GPA (Giảm dần)");
            System.out.println("0. Thoát sắp xếp");
            System.out.print("Chọn tùy chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    students.sort(Comparator.comparing(s -> s.getStudentName()));
                    System.out.println("Đã sắp xếp theo tên (Tăng dần)");
                    displayStudents(students);
                    break;
                case 2:
                    students.sort(Comparator.comparing(s -> s.getStudentName(), Comparator.reverseOrder()));
                    System.out.println("Đã sắp xếp theo tên (Giảm dần)");
                    displayStudents(students);
                    break;
                case 3:
                    students.sort(Comparator.comparing(s -> s.getGpa()));
                    System.out.println("Đã sắp xếp theo GPA (Tăng dần)");
                    displayStudents(students);
                    break;
                case 4:
                    students.sort(Comparator.comparing(s -> s.getGpa(), Comparator.reverseOrder()));
                    System.out.println("Đã sắp xếp theo GPA (Giảm dần)");
                    displayStudents(students);
                    break;
                case 0:
                    System.out.println("Thoát sắp xếp...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        }
    }

    public static void displayStudents(ArrayList<Student> students) {
        System.out.println("\n===== Danh scah sinh vien sau khi sap xep =====");
        for (Student student : students) {
            student.display();
            System.out.println("///////////////////////////////");
        }
    }
}
