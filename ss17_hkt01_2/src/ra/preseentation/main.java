package ra.preseentation;


import ra.business.Change_Infor;
import ra.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

import static ra.business.sortStudents.sortStudentss;


public class main {
    public static void main(String[] args) {
        boolean menu2 = false;
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        int size = 0;
        System.out.println("Enter Your First Name: ");
        do {
            System.out.println("---------------- Student Menu ---------------- ");
            System.out.println("1.Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Sắp xếp");
            System.out.println("0. Thoát chương trình");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (size == 0) {
                        System.err.println("Khong co sinh vien nao de in ra");
                        break;
                    } else {
                        System.out.println("-------------- Student Menu --------------- ");
                        for (int i = 0; i < size; i++) {
                            students.get(i).display();
                            System.out.println("------------------------------");
                        }
                        break;
                    }
                    case 2:
                        System.out.println("Nhap so luong sinh vien muon them ");
                        int n = sc.nextInt();
                        for (int i = size; i < size + n; i++) {
                            students.add(new Student());
                        }
                        size += n;
                        System.out.println("Them moi thanh cong !!");
                        break;
                    case 3:
                        System.out.println("Nhap ma sinh vien muon sua");
                        sc.nextLine();
                        String s = sc.nextLine();
                        new Change_Infor(students, s, size, sc);
                        break;
                    case 4:
                        System.out.println("Nhap ma sinh vien muon xoa");
                        sc.nextLine();
                        String x = sc.nextLine();
                        for (int i = 0; i < students.size(); i++) {
                            if (students.get(i).getStudent_id().equals(x)) {
                                students.remove(i);
                            }
                        }
                        break;
                case 5:
                    do {
                        System.out.println("Tìm kiếm theo :");
                        System.out.println("1.Tìm kiếm theo tên");
                        System.out.println("2.Tìm kiếm theo lớp hợc");
                        System.out.println("3.Tìm kiếm theo khoảng");
                        int k = sc.nextInt();
                        if (k >= 1 && k <= 3) {
                            switch (k) {
                                case 1:
                                    System.out.println("Nhập tên :");
                                    String name = sc.nextLine();
                                    for (int i = 0; i < size; i++) {
                                        if (name.equals(students.get(i).getStudentName())) {
                                            System.out.println(students.get(i).display());
                                        } else {
                                            System.out.println("Khng tìm kiếm thấy sinh viên");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("Nhập lớp học muốn tìm ");
                                    String className = sc.nextLine();
                                    for (int i = 0; i < size; i++) {
                                        if (className.equals(students.get(i).getClassName())) {
                                            System.out.println(students.get(i).display());
                                        } else {
                                            System.out.println("Khong tìm kiếm thấy sinh viên");
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println("Nhập điểm khởi tạo :");
                                    int score_from = sc.nextInt();
                                    System.out.println("Nhập điểm kết thúc :");
                                    int score_to = sc.nextInt();
                                    for (int i = 0; i < size; i++) {
                                        if (students.get(i).getGpa() >= score_from && students.get(i).getGpa() <= score_to) {
                                            System.out.println(students.get(i).display());
                                        } else {
                                            System.out.println("Khong tìm kiếm thấy sinh viên");
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                    while (menu2);
                case 6:
                    sortStudentss(students, size, sc);
                    break;
                case 7:
                    System.out.println("Chương trình kết thúc. Hẹn gặp lại!");
                    System.exit(0);
                    break;

            }
        }while (true);
    }

}
