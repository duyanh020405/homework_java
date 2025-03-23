package ss17_htk01_1.src.hkt_01.bussiness;

import ss17_htk01_1.src.hkt_01.entity.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {
    public static void sortStudents(Student[] students, int size, Scanner sc) {
        if (size == 0) {
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

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập số.");
                continue;
            }

            switch (choice) {
                case 1:
                    Arrays.sort(students, 0, size, Comparator.comparing(Student::getStudentName));
                    System.out.println("Đã sắp xếp theo tên (Tăng dần)");
                    displayStudents(students, size);
                    break;
                case 2:
                    Arrays.sort(students, 0, size, Comparator.comparing(Student::getStudentName).reversed());
                    System.out.println("Đã sắp xếp theo tên (Giảm dần)");
                    displayStudents(students, size);
                    break;
                case 3:
                    Arrays.sort(students, 0, size, Comparator.comparing(Student::getGpa));
                    System.out.println("Đã sắp xếp theo GPA (Tăng dần)");
                    displayStudents(students, size);
                    break;
                case 4:
                    Arrays.sort(students, 0, size, Comparator.comparing(Student::getGpa).reversed());
                    System.out.println("Đã sắp xếp theo GPA (Giảm dần)");
                    displayStudents(students, size);
                    break;
                case 0:
                    System.out.println("Thoát sắp xếp...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại.");
            }
        }
    }

    public static void displayStudents(Student[] students, int size) {
        System.out.println("\n===== DANH SÁCH SINH VIÊN SAU KHI SẮP XẾP =====");
        for (int i = 0; i < size; i++) {
            students[i].display();
            System.out.println("------------------------");
        }
    }
}
