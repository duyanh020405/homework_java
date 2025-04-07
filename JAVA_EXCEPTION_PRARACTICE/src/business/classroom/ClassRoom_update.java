package business.classroom;

import entity.ClassRoom;
import entity.Course;
import entity.Student;
import entity.Teacher;
import presentation.UniversityManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassRoom_update {
    static List<ClassRoom> classRooms = UniversityManager.classRooms;
    static List<Course> courses = UniversityManager.courses;
    static List<Teacher> teachers = UniversityManager.teachers;
    static List<Student> students = UniversityManager.students;
    static Scanner sc = new Scanner(System.in);

    public static void ClassRoom_update() {
        System.out.println("Nhập ID lớp học cần cập nhật:");
        int id = sc.nextInt(); sc.nextLine();

        ClassRoom target = null;
        for (ClassRoom c : classRooms) {
            if (c.getClassRoomId() == id) {
                target = c;
                break;
            }
        }

        if (target == null) {
            System.out.println("Không tìm thấy lớp học.");
            return;
        }
        if(target.getStatus() == ClassRoom.Status.CLOSE) {
                return;
        }

        System.out.println("Tên lớp hiện tại: " + target.getClassRoomName());
        System.out.print("Nhập tên mới (bỏ trống để giữ nguyên): ");
        String name = sc.nextLine();
        if (name.length() > 15 && name.length() < 50) {
            target.setClassRoomName(name);
        }

        System.out.print("Nhập Course ID mới (bỏ trống để giữ nguyên): ");
        String courseId = sc.nextLine();
        if (!courseId.isEmpty()) {
            for (Course c : courses) {
                if (c.getCourseId().equals(courseId)) {
                    target.setCourseId(courseId);
                    break;
                }
            }
        }

        System.out.print("Nhập Teacher ID mới (0 để giữ nguyên): ");
        int teacherId = sc.nextInt(); sc.nextLine();
        if (teacherId != 0) {
            for (Teacher t : teachers) {
                if (t.getTeacherId() == teacherId) {
                    target.setTeacherId(teacherId);
                    break;
                }
            }
        }

        System.out.print("Cập nhật danh sách sinh viên? (y/n): ");
        String updateStu = sc.nextLine();
        if (updateStu.equalsIgnoreCase("y")) {
            List<Student> newList = new ArrayList<>();
            System.out.print("Số lượng sinh viên: ");
            int count = sc.nextInt(); sc.nextLine();
            for (int i = 0; i < count; i++) {
                System.out.print("Nhập ID sinh viên: ");
                String sid = sc.nextLine();
                for (Student s : students) {
                    if (s.getIdStudent().equals(sid)) {
                        newList.add(s);
                        break;
                    }
                }
            }
            target.setListStudents(newList);
        }

        System.out.println("Chọn trạng thái mới: 1. PENDING | 2. PROGESS | 3. CLOSE");
        int status = sc.nextInt();
        switch (status) {
            case 1 -> target.setStatus(ClassRoom.Status.PENDING);
            case 2 -> target.setStatus(ClassRoom.Status.PROGESS);
            case 3 -> target.setStatus(ClassRoom.Status.CLOSE);
        }

        target.setCreated(LocalDate.now());
        System.out.println("Cập nhật lớp học thành công.");
    }
}
