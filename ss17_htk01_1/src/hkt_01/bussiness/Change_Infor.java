package ss17_htk01_1.src.hkt_01.bussiness;

import ss17_htk01_1.src.hkt_01.entity.Student;

import java.util.Scanner;

public class Change_Infor {
    public Change_Infor(Student[] students, String id, int size, Scanner sc) {
        for (int i = 0; i < size; i++) {
            if (students[i].getStudent_id().equals(id)) {
                System.out.println("Nhap ten sinh vien (an enter de luot qua): ");
                String new_name = sc.nextLine().trim();
                if (!new_name.isEmpty()) {
                    students[i].setStudentName(new_name);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                }

                System.out.println("Nhap ngay sinh muon thay doi (an enter de luot qua)");
                String new_birthday = sc.nextLine().trim();
                if (!new_birthday.isEmpty()) {
                    students[i].setBirthday(new_birthday);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                }

                System.out.println("Nhap so dien thoai muon thay doi (an enter de luot qua)");
                String new_phoneNumber = sc.nextLine().trim();
                if (!new_phoneNumber.isEmpty()) {
                    students[i].setPhoneNumber(new_phoneNumber);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                }


                System.out.println("Thay doi gioi tinh (true-nam , false- nu)(an enter de luot qua)");
                boolean new_sex = sc.nextBoolean();
                if (new_sex) {
                    students[i].setSex(new_sex);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                }
                else if(!new_sex) {
                    students[i].setSex(new_sex);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                }

                System.out.println("Thay doi email sinh vien doi (an enter de luot qua)");
                String new_email = sc.nextLine().trim();
                if (!new_email.isEmpty()) {
                    students[i].setEmail(new_email);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                }


                System.out.println("Thay doi major sinh vien doi (an enter de luot qua)");
                String major = sc.nextLine().trim();
                if (!major.isEmpty()) {
                    students[i].setMajor(major);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                }

                System.out.println("Thay doi ten lop sinh vien  (an enter de luot qua)");
                String class_name = sc.nextLine().trim();
                if (!class_name.isEmpty()) {
                    students[i].setClassName(class_name);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                }


                System.out.println("Thay doi gpa sinh vien  (an enter de luot qua)");
                float gpa = sc.nextFloat();
                if (gpa >= 0 && gpa <= 1) {
                    students[i].setGpa(gpa);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                }

                System.out.println("Thay doi ten lop sinh vien  (an enter de luot qua)");
                byte status = sc.nextByte();
                if (status == 1 || status == 2 || status == 3) {
                    students[i].setStatus(status);
                    System.out.println("Thong tin sinh vien da duoc cap nhat!");
                } else
                    System.out.println("Chinh sua thanh cong");
                break;
            }
            else {
                System.out.println("Khong tim thay sinh vien nao");
                break;
            }

        }
    }
}

