package ss2;

import java.util.Scanner;

public class bt8 {
    static class Student {
        String name;
        double subject_1;
        double subject_2;
        double subject_3;
        double totalSubject;

        public Student(String name,
                       double subject_1,
                       double subject_2,
                       double subject_3,
                       double totalSubject) {
            this.name = name;
            this.subject_1 = subject_1;
            this.subject_2 = subject_2;
            this.subject_3 = subject_3;
            this.totalSubject = totalSubject;
        }

        public void display() {
            System.out.println("Tên học sinh: " + name + " - Điểm trung bình: " + totalSubject);
        }

        ;

    }

    ;

    //    =( subject_1 + subject_2 + subject_3 )/3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so hoc sinh muon nhap");
        int n = sc.nextInt();
        sc.nextLine();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap ten hoc sinh so " + (i + 1));
            String name = sc.nextLine();
//            sc.nextLine();

            System.out.println("Diem mon thu 1");
            double subject_1 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Diem mon thu 2");
            double subject_2 = sc.nextDouble();
            sc.nextLine();

            System.out.println("Diem mon thu 3");
            double subject_3 = sc.nextDouble();
            sc.nextLine();
            double totalSubject = (subject_1 + subject_2 + subject_3) / 3;
            students[i] = new Student(name, subject_1, subject_2, subject_3, totalSubject);
        }
        System.out.println("\nDanh sách học sinh:");
        for (Student student_infor : students) {
            student_infor.display();
        }

        sc.close();
    }
}
