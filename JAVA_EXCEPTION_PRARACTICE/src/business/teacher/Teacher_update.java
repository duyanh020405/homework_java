package business.teacher;

import entity.ClassRoom;
import entity.Teacher;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class Teacher_update {
    static List<Teacher> teacherList = UniversityManager.teachers;
    static List<ClassRoom> classRoomList = UniversityManager.classRooms;
    static Scanner scanner = new Scanner(System.in);
    public static void teacherUpdate() {
        System.out.println("Enter id teacher to update");
        int id = scanner.nextInt();
        for (Teacher teacher : teacherList) {
            if(teacher.getTeacherId() == id) {
                System.out.println("Enter subject name");
                String subjectName = scanner.nextLine();
                if(!subjectName.isEmpty()) {
                    System.out.println("Successfully");
                }
                else {
                    teacher.setSubject(teacher.getSubject());
                }
            }
        }
    }

}
