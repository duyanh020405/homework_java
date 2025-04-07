package business.student;

import entity.ClassRoom;
import entity.Student;
import presentation.UniversityManager;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Student_delete {
    static List<Student> studentList = UniversityManager.students;
    static List<ClassRoom> classRoomList = UniversityManager.classRooms;
    static Scanner scanner = new Scanner(System.in);

    public static void student_delete() {
        System.out.print("Enter Student ID to delete: ");
        String studentID = scanner.nextLine();
        for (ClassRoom classRoom : classRoomList) {
            if (classRoom.getListStudents().contains(studentID)) {
                System.out.println("Can't delete");
                return;
            }
        }
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getIdStudent().equals(studentID)) {
                iterator.remove();
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
