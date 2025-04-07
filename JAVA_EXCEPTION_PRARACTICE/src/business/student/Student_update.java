package business.student;

import entity.ClassRoom;
import entity.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student_update {
    public static List<Student> studentList = new ArrayList<Student>();
    public static List<ClassRoom> classRoom = new ArrayList<>();

    public static void student_update (){
        System.out.println("Enter student id to update: ");
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        for(Student student : studentList){
            if(student.getIdStudent().equals(id)){
                System.out.println("Enter gpa to update: ");
                double gpa = sc.nextDouble();
                if(gpa >= 0 && gpa <= 10){
                    student.setGpa(gpa);
                    System.out.println("Successfully updated student");
                }
            }
            else {
                System.out.println("Cannot find student with id: " + id);
            }
        }
    }
}
