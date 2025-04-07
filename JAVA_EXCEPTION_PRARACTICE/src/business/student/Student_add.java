package business.student;

import entity.Student;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class Student_add {
    static Scanner scanner = new Scanner(System.in);
    static List<Student> studentList = UniversityManager.students;
    public static void student_add() {
        Student newStudent  = new Student();
        studentList.add(newStudent);
        System.out.println("Successfully added student");
    }
}
