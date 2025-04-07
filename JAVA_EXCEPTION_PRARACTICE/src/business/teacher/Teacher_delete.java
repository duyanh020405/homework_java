package business.teacher;

import entity.ClassRoom;
import entity.Teacher;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class Teacher_delete {
    static List<Teacher> teacherList = UniversityManager.teachers;
    static List<ClassRoom> classRoomList = UniversityManager.classRooms;
    static Scanner scanner = new Scanner(System.in);
    public static void teacher_delete() {
        System.out.print("Enter Teacher ID to delete: ");
        int teacherID = scanner.nextInt();
        for (ClassRoom classRoom : classRoomList) {
            if(classRoom.getTeacherId() == teacherID) {
                System.out.print("Can't delete");
            }
            else {
                for (Teacher teacher : teacherList) {
                    if(teacher.getTeacherId() == teacherID) {
                        teacherList.remove(teacher);
                        System.out.println("Teacher deleted");
                        break;
                    }
                }

            }
        }
    }
}
