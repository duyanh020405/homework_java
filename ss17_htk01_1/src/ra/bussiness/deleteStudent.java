package ss17_htk01_1.src.ra.bussiness;

import ss17_htk01_1.src.ra.entity.Student;

import java.util.Scanner;

public class deleteStudent {
    public static void deleteStudent(Student[] students, int size, Scanner sc ) {
        System.out.println("Nhập mã sinh viên muốn xóa:");
        String x = sc.nextLine().trim();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (students[i] != null && students[i].getStudent_id().equals(x)) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[size - 1] = null;
                System.out.println("Xoa thanh cong");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien");
        }
    }

}
