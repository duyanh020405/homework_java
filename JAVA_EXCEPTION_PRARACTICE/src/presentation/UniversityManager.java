package presentation;
import business.COURSE_REGISTRATION_MENU.Approve_application;
import business.COURSE_REGISTRATION_MENU.Cancel_register_course;
import business.COURSE_REGISTRATION_MENU.Register_course;
import business.Dashboard.All_infor;
import business.classroom.*;
import business.course.Course_add;
import business.course.Course_delete;
import business.course.Course_update;
import business.student.Student_add;
import business.student.Student_delete;
import business.student.Student_update;
import business.teacher.Teacher_add;
import business.teacher.Teacher_delete;
import business.teacher.Teacher_update;
import entity.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UniversityManager {
    public static List<Course> courses  = new ArrayList<Course>();
    public static List<ClassRoom> classRooms = new ArrayList<>();
    public static List<Teacher> teachers = new ArrayList<>();
    public static List<Student> students = new ArrayList<>();
    public static List<CourseRegistration> courseRegistrations = new ArrayList<>();
    public static List<Schedule> schedules = new ArrayList<>();
    public static void main(String[] args) {
        boolean course = false;
        boolean teacher = false;
        boolean student = false;
        boolean c_registation = false;
        boolean class_room = false;
        boolean das = false;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("************************* UNIVERSITY MENU **********************");
            System.out.println("1. Quản lý khóa học");
            System.out.println("2. Quản lý giảng viên");
            System.out.println("3. Quản lý sinh viên");
            System.out.println("4. Đăng ký khóa học");
            System.out.println("5. Quản lý lớp học");
            System.out.println("6. Thống kê");
            System.out.println("7. Thoát");
            System.out.println("Nhap vao");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    course = true;
                    do{
                        System.out.println("************************* COURSE MENU *************************");
                        System.out.println("1. Danh sách khóa học sắp xếp theo tên tăng dần");
                        System.out.println("2. Thêm mới khóa học");
                        System.out.println("3. Cập nhật khóa học");
                        System.out.println("4. Xóa khóa học theo ID (Chỉ xóa được khóa học nếu khóa học chưa có lớp học)");
                        System.out.println("5. Thoát");
                        System.out.println("Chon di !!");
                        int choice_course = sc.nextInt();
                        switch(choice_course){
                            case 1:
                                if(courses.isEmpty()){
                                    System.out.println("Chua co thong tin khoa hoc nao !");
                                    break;
                                }
                                else{
                                    courses.sort(Comparator.comparing(Course::getCourseName));
                                    for(Course c : courses){
                                        System.out.println(c.getCourseName() +"\n") ;
                                    }
                                }
                                break;
                            case 2 :
                                Course_add.add_course();
                                break;
                            case 3 :
                                Course_update.course_update();
                                break;
                            case 4 :
                                Course_delete.delete_course();
                                break;
                            case 5 :
                                course = false;
                                break;
                        }
                    }
                    while(course);
                    break;

                case 2:
                    teacher = true;
                    do{
                        System.out.println("*************************TEACHER MENU**************************");
                        System.out.println("1. Danh sách giảng viên sắp xếp theo mã giảm dần");
                        System.out.println("2. Thêm mới giảng viên");
                        System.out.println("3. Cập nhật giảng viên");
                        System.out.println("4. Xóa giảng viên (chỉ xóa được nếu giảng viên chưa được xếp lớp)");
                        System.out.println("5. Thoát");
                        System.out.print("Chọn chức năng: ");
                        int choice_t = sc.nextInt();
                        switch(choice_t){
                            case 1:
                                if(teachers.isEmpty()){
                                    System.out.println("Chua co thong tin khoa hoc nao !");
                                    break;
                                }
                                teachers.sort(Comparator.comparing(Teacher::getTeacherId));
                                for(Teacher t : teachers){
                                    System.out.println(t.getTeacherId() +"\n") ;
                                }
                                break;
                            case 2 :
                                Teacher_add.teacherAdd();
                                break;
                            case 3 :
                                Teacher_update.teacherUpdate();
                                break;
                            case 4 :
                                Teacher_delete.teacher_delete();
                                break;
                            case 5 :
                                teacher = false;
                                break;
                        }

                    }
                    while(teacher);
                    break;
                case 3:
                    student = true;
                    do{

                        System.out.println("************************STUDENT MENU***************************");
                        System.out.println("1. Danh sách sinh viên được sắp xếp theo tên tăng dần");
                        System.out.println("2. Thêm mới sinh viên");
                        System.out.println("3. Cập nhật sinh viên");
                        System.out.println("4. Xóa sinh viên (chỉ xóa nếu sinh viên chưa đăng ký khóa học nào)");
                        System.out.println("5. Thoát");
                        System.out.print("Chọn chức năng: ");
                        int choice_s = sc.nextInt();
                        switch(choice_s){
                            case 1:
                                if(students.isEmpty()){
                                    System.out.println("Chua co thong sinh vien nao hoc nao !");
                                }
                                else{
                                    students.sort(Comparator.comparing(Student :: getStudentName).reversed());
                                    break;
                                }
                            case 2:
                                Student_add.student_add();
                                break;
                            case 3 :
                                Student_update.student_update();
                                break;
                            case 4 :
                                Student_delete.student_delete();
                                break;
                            case 5 :
                                student = false;
                                break;
                        }

                    }while (student );
                    break;
                case 4:
                    c_registation = true;
                    do{
                        System.out.println("****************** COURSE REGISTRATION MENU ********************");
                        System.out.println("1. Đăng ký khóa học cho sinh viên");
                        System.out.println("2. Hủy đăng ký học cho sinh viên (Chỉ được hủy nếu trạng thái là PENDING)");
                        System.out.println("3. Duyệt đăng ký học sinh viên (PENDING → ENROLLED)");
                        System.out.println("4. Xem danh sách sinh viên đăng ký từ từng khóa học");
                        System.out.println("5. Thoát");
                        int choice_r = sc.nextInt();
                        switch(choice_r){
                            case 1:
                                Register_course.register_course();
                                break;
                            case 2:
                                Approve_application.approve_application();
                                break;
                            case 3:
                                Cancel_register_course.cancel_register_course();
                                break;
                            case 4 :
                                if(courseRegistrations.isEmpty()){
                                    System.out.println("Chua co thong tin  nao !");
                                }else {
                                    for (CourseRegistration cr : courseRegistrations) {
                                        System.out.println(cr.getCourseId());
                                        for (Student t : students) {
                                            if (cr.getStudentId().equals(t.getIdStudent())) {
                                                System.out.println(t.getStudentName() + " ," + t.getIdStudent() + "\n");
                                            }
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 5:
                                c_registation = false;
                                break;




                        }

                    }
                    while (c_registation);
                    break;

                case 5:
                    class_room = true;
                    do{
                        System.out.println("********************** CLASS ROOM MENU **********************");
                        System.out.println("1. Danh sách lớp học sắp xếp theo ngày tạo giảm dần");
                        System.out.println("2. Thêm mới lớp học");
                        System.out.println("3. Cập nhật thông tin lớp học (Chỉ cập nhật được thông tin nếu trạng thái khác CLOSE)");
                        System.out.println("4. Xóa lớp học (Chỉ xóa được nếu lớp học chưa có sinh viên và giảng viên)");
                        System.out.println("5. Phân công giảng viên cho lớp học");
                        System.out.println("6. Thêm sinh viên vào cho lớp học");
                        System.out.println("7. Tạo lịch học cho lớp học");
                        System.out.println("8. Cập nhật trạng thái lớp học (PENDING → PROGRESS → CLOSE)");
                        System.out.println("9. Thoát");
                        System.out.print("Chọn một tùy chọn (1-9): ");
                        int choice_cr = sc.nextInt();
                        switch(choice_cr){
                            case 1:
                                if(classRooms.isEmpty()){
                                    System.out.println("Don't have any class");
                                    break;
                                }
                                else {
                                    for (ClassRoom cr : classRooms) {
                                        System.out.println(cr.getCourseId() +" |"+ cr.getClassRoomName());
                                    }
                                }
                                break;
                            case 2 :
                                ClassRoom new_class = new ClassRoom();
                                new_class.inputData(sc);
                                classRooms.add(new_class);
                                break;
                            case 3 :
                                ClassRoom_update.ClassRoom_update();
                                break;
                            case 4 :
                                ClassRoom_delete.classRoom_delete();
                                break;
                            case 5 :
                                ClassRoom_teacher_division.classRoom_teacher_division();
                                break;
                            case 6 :
                                ClassRoom_add_newStudent.classRoom_add_newStudent();
                                break;
                            case 7 :
                                Schedule new_schedule = new Schedule();
                                new_schedule.inputData(sc);
                                schedules.add(new_schedule);
                                break;
                            case 8 :
                                ClassRoom_update_state.ClassRoom_update_state();
                                break;
                            case 9 :
                                class_room = false;
                                break;

                        }
                    }
                    while(class_room);
                    break;
                case 6:
                    do{
                        System.out.println("************************** DASHBOARD **************************");
                        System.out.println("1. Thống kê số sinh viên, giảng viên, khóa học, lớp học");
                        System.out.println("2. Top 3 khóa học có nhiều sinh viên nhất");
                        System.out.println("3. Top 3 lớp học có nhiều sinh viên nhất");
                        System.out.println("4. Top 3 giảng viên dạy nhiều sinh viên nhất");
                        System.out.println("5. Top 3 sinh viên đăng ký học nhiều nhất");
                        System.out.println("6. Thoát");
                        System.out.print("Chọn chức năng (1-6): ");
                        int choice_das = sc.nextInt();
                        switch(choice_das){
                            case 1:
                                All_infor.getClassRoomList();
                                break;
                            case 2:
                                courseRegistrations.stream()
                                        .collect(Collectors.groupingBy(CourseRegistration::getCourseId, Collectors.counting()))
                                        .entrySet().stream()
                                        .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                                        .limit(3)
                                        .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

                                break;
                            case 3:
                                classRooms.stream()
                                        .collect(Collectors.groupingBy(ClassRoom::getListStudents, Collectors.counting()))
                                        .entrySet().stream()
                                        .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                                        .limit(3)
                                        .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
                                break;
                            case 4:
                                classRooms.stream()
                                        .collect(Collectors.groupingBy(ClassRoom::getTeacherId, Collectors.counting()))
                                        .entrySet().stream()
                                        .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                                        .limit(3)
                                        .forEach(e -> System.out.println("Giảng viên: " + e.getKey() + " - Số sinh viên: " + e.getValue()));
                            case 5 :
                                courseRegistrations.stream()
                                        .collect(Collectors.groupingBy(CourseRegistration::getStudentId, Collectors.counting()))
                                        .entrySet().stream()
                                        .sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
                                        .limit(3)
                                        .forEach(e -> System.out.println("Sinh viên: " + e.getKey() + " - Số khóa học: " + e.getValue()));
                                break;
                            case 6 :
                                System.exit(0);
                                break;
                        }


                    }while (das);

            }
        }while (true);
    }
}
