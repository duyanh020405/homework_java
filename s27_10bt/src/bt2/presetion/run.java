package bt2.presetion;

import bt2.modle.Student;
import bt2.service.StudentService;
import bt2.service.StudentServiveImp;

import java.util.Scanner;

public class run {
    private static StudentService studentService;
    public static void main(String[] args) {
        studentService = new StudentServiveImp();

        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.inputData(sc);
        studentService.save(student);
    }
}
