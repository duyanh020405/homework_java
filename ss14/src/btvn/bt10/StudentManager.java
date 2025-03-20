package btvn.bt10;

import java.util.ArrayList;
import java.util.Scanner;
class StudentManager {
    private ArrayList<Student> students;
    private Scanner scanner;

    public StudentManager() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // 1. Nhập danh sách sinh viên
    public void inputStudents() {
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Xóa bộ nhớ đệm

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Mã sinh viên: ");
            String id = scanner.nextLine();
            System.out.print("Họ và tên: ");
            String name = scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine(); // Xóa bộ nhớ đệm

            students.add(new Student(id, name, gpa));
        }
    }

    // 2. Hiển thị danh sách sinh viên
    public void displayStudents() {
        System.out.println("\nDanh sách sinh viên:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // 3. Tìm kiếm sinh viên theo tên
    public void searchStudentByName() {
        System.out.print("\nNhập tên sinh viên cần tìm: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(student);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có tên: " + name);
        }
    }

    // 4. Phân loại sinh viên theo GPA
    public void classifyStudents() {
        System.out.println("\nDanh sách sinh viên sau khi phân loại:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // 5. Menu điều khiển
    public void menu() {
        while (true) {
            System.out.println("\n===== QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo tên");
            System.out.println("4. Phân loại sinh viên theo GPA");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ nhớ đệm

            switch (choice) {
                case 1:
                    inputStudents();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudentByName();
                    break;
                case 4:
                    classifyStudents();
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
            }
        }
    }
}
