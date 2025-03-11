import java.util.ArrayList;
import java.util.Scanner;
public class bt10{

enum Gender {
    MALE, FEMALE, OTHER
}

class Student {
    private int id;
    private String name;
    private int age;
    private Gender gender;
    private String address;
    private String phoneNumber;
    public Student() {}

    public Student(int id, String name, int age, Gender gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã sinh viên: ");
        this.id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập tên sinh viên: ");
        this.name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính (1: Nam, 2: Nữ, 3: Khác): ");
        int genderChoice = scanner.nextInt();
        scanner.nextLine();
        switch (genderChoice) {
            case 1 -> this.gender = Gender.MALE;
            case 2 -> this.gender = Gender.FEMALE;
            default -> this.gender = Gender.OTHER;
        }

        System.out.print("Nhập địa chỉ: ");
        this.address = scanner.nextLine();

        System.out.print("Nhập số điện thoại: ");
        this.phoneNumber = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("Mã SV: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Địa chỉ: " + address);
        System.out.println("SĐT: " + phoneNumber);
        System.out.println("----------------------------");
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

public class StudentManager {
    private static final ArrayList<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    private static void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
        } else {
            for (Student student : students) {
                student.displayData();
            }
        }
    }

    // Thêm sinh viên mới
    private void addStudent() {
        Student student = new Student();
        student.inputData(scanner);
        students.add(student);
        System.out.println("Thêm sinh viên thành công!");
    }

    private static void editStudent() {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Nhập tên mới: ");
                student.setName(scanner.nextLine());

                System.out.print("Nhập tuổi mới: ");
                student.setAge(scanner.nextInt());
                scanner.nextLine();

                System.out.print("Nhập giới tính mới (1: Nam, 2: Nữ, 3: Khác): ");
                int genderChoice = scanner.nextInt();
                scanner.nextLine();
                switch (genderChoice) {
                    case 1 -> student.setGender(Gender.MALE);
                    case 2 -> student.setGender(Gender.FEMALE);
                    default -> student.setGender(Gender.OTHER);
                }

                System.out.print("Nhập địa chỉ mới: ");
                student.setAddress(scanner.nextLine());

                System.out.print("Nhập số điện thoại mới: ");
                student.setPhoneNumber(scanner.nextLine());

                System.out.println("Cập nhật thông tin sinh viên thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã " + id);
    }

    private static void deleteStudent() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Xóa sinh viên thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có mã " + id);
    }

    public void main(String[] args) {
        while (true) {
            System.out.println("\n----- MENU QUẢN LÝ SINH VIÊN -----");
            System.out.println("1. Hiển thị danh sách tất cả sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> displayAllStudents();
                case 2 -> addStudent();
                case 3 -> editStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }
}
}
