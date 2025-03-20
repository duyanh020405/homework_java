package ra.entity;

import java.util.Scanner;

public class StudentApplication {

    public static void main(String[] args) {
        Student[] students = new Student[100];
        int count = 0;
        boolean cs5 = false ;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        do {System.out.println("---------------- Student Menu ---------------- ");
            System.out.println("1.Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Sắp xếp");
            System.out.println("0. Thoát chương trình");
            int choice = scanner.nextInt();
            if (choice >= 0 && choice <= 6) {
                switch (choice) {
                    case 1:
                        if (students[0] == null) {
                            System.out.println("Không có sinh viên nào để in ra");
                            break;
                        } else {
                            for (int i = 0; i < count ; i++) {
                                System.out.println(students[i].displayData(scanner));
                                break;
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Nhập số học sinh muốn thêm vào :");
                        int n = scanner.nextInt();
                            for (int i = 0; i < n; i++) {
                                Student new_student = Student.inputData(scanner);
                                students[i] = new_student;
                                count++;
                                System.out.println("Thêm thành công");
                            }
                        break;
                     case 3:
                         System.out.println("Nhập id muốn sửa");
                         break;
                    case 4 :
                        System.out.println("Nhập id muốn xóa :");
                        String id = scanner.next();

                        break;
                    case 5:
                        do{
                        System.out.println("Tìm kiếm theo :");
                        System.out.println("1.Tìm kiếm theo tên");
                        System.out.println("2.Tìm kiếm theo lớp hợc");
                        System.out.println("3.Tìm kiếm theo khoảng");
                        int k = scanner.nextInt();
                        if(k >=1 && k <= 3){
                            switch (k) {
                                case 1:
                                    System.out.println("Nhập tên :");
                                    String name = scanner.nextLine();
                                    for (int i = 0; i < count; i++) {
                                        if(name.equals(students[i].getStudentName()) ) {
                                            System.out.println(students[i].displayData(scanner));
                                        }
                                        else {
                                            System.out.println("Khng tìm kiếm thấy sinh viên");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("Nhập lớp học muốn tìm ");
                                    String className = scanner.nextLine();
                                    for (int i = 0; i < count; i++) {
                                    if(className.equals(students[i].getClassName())) {
                                        System.out.println(students[i].displayData(scanner));
                                    }
                                    else {
                                        System.out.println("Khong tìm kiếm thấy sinh viên");
                                    }
                                }
                                break;
                                case 3:
                                    System.out.println("Nhập điểm khởi tạo :");
                                    int score_from = scanner.nextInt();
                                    System.out.println("Nhập điểm kết thúc :");
                                    int score_to = scanner.nextInt();
                                    for (int i = 0; i < count; i++) {
                                        if(students[i].getGpa() >= score_from && students[i].getGpa() <= score_to)
                                        {
                                            System.out.println(students[i].displayData(scanner));
                                        }
                                        else {
                                            System.out.println("Khong tìm kiếm thấy sinh viên");
                                        }
                                    }
                                    break;
                                case 4:
                                    cs5 = false;
                            }
                        }
                        ;
                        }while (cs5);
                            break;

                      case 6:
                          System.out.println("Kết thúc chương trình ");
                          flag = false;

                      break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }
            }


        }
        while (flag);
    }
}
