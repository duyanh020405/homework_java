package business.teacher;

import entity.Teacher;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class Teacher_add {
    static Scanner scanner = new Scanner(System.in);
    static List<Teacher> teacherList = UniversityManager.teachers;
    public static void teacherAdd() {
        System.out.println("Enter subject");
        String subject = scanner.nextLine();
        if (!subject.isEmpty()) {
            Teacher teacher = new Teacher();
            teacher.setSubject(subject);
            teacherList.add(teacher);
            System.out.print("Successfully ");
        }
        else {
            System.out.print("Invalid subject");
        }
    }
}
