package presentation;

import business.model.Student;
import business.sevired.student.StudentService;
import business.sevired.student.Student_service;

import java.util.List;
import java.util.Scanner;

public class StudentUI {
    static Scanner scanner = new Scanner(System.in);
    private final StudentService student_service ;

    public StudentUI() {
        student_service = new Student_service();
    }

    public static void displayStudent() {
        StudentUI studentUI = new StudentUI();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("--------------STUDENT MANAGER----------------");
            System.out.println("0. List Student");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Find Student by status");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch(choice) {
                case 0:
                    studentUI.displayAllStudents();
                    break;
                case 1:
                    studentUI.addStudent();
                    break;
                case 2:
                    studentUI.deleteStudent();
                    break;
                case 3:
                    studentUI.editStudent();
                    break;
                case 4:
                    studentUI.getCountbyState();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice (from 0 to 5)");
                    break;
            }
        }
        while(true);
    }
    public void displayAllStudents() {
        List<Student> studentList = student_service.findAll();
        studentList.forEach(System.out::println);
    }
    public void addStudent(){
        System.out.println("enter number student want to add");
        int size = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < size; i++) {
            Student student = new Student();
            student.inputData(scanner);
            student_service.save(student);
        }

    }
    public void deleteStudent(){
        System.out.println("enter number student want to delete");
        int id = scanner.nextInt();
        scanner.nextLine();
        List<Student> studentList = student_service.findAll();
        for(Student student : studentList) {
            if(student.getId() == id) {
                student_service.delete(student);
            }
        }
    }

    public void editStudent(){
        System.out.println("enter number student want to edit");
        int id = scanner.nextInt();
        scanner.nextLine();
        List<Student> studentList = student_service.findAll();
        for(Student student : studentList) {
            if(student.getId() == id) {
                student.inputData(scanner);
                student_service.update(student);
            }
        }
    }

    public void getCountbyState(){
        System.out.println("enter state student want to count (true/false) :");
        boolean state = Boolean.parseBoolean(scanner.nextLine());
        List<Student> studentList = student_service.findAll();
        student_service.getCountbystate(state ,studentList);
    }
}
