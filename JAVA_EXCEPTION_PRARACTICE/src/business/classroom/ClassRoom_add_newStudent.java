package business.classroom;

import entity.ClassRoom;
import entity.Student;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class ClassRoom_add_newStudent {
    public static List<Student> studentList = UniversityManager.students;
    public static List<ClassRoom> classRoomsList = UniversityManager.classRooms;
    static Scanner sc = new Scanner(System.in);
    static boolean add = true;
    public static void classRoom_add_newStudent() {
        System.out.println("Enter classId name: ");
        String classId = sc.nextLine();
        for(ClassRoom classRoom : classRoomsList){
            if(classRoom.getClassRoomId().equals(classId)){
                do{
                    System.out.println("1. Create Student and add ClassRoom ");
                    System.out.println("2. Add Student in list student to ClassRoom ");
                    System.out.println("3.Exit ");
                    System.out.println("Your choice: ");
                    int choice = sc.nextInt();
                    switch(choice){
                        case 1:
                            Student newStudent = new Student();
                            newStudent.inputData(sc);
                            classRoomsList.add(classRoom);
                            break;
                        case 2:
                            System.out.println("Enter classId student: ");
                            String studentId = sc.nextLine();
                            for(ClassRoom classRoom1 : classRoomsList){
                                List<Student> check = classRoom1.getListStudents();
                                for(Student student : check){
                                    if(student.getIdStudent().equals(studentId)){
                                        System.out.println("Student has class , please find other people");
                                        return;
                                    }
                                    else {
                                        classRoom1.getListStudents().add(student);
                                        System.out.println("Successfully added student");
                                    }
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Exit");
                            add = false;
                            break;
                    }
                }
                while (add);
            }
        }

    }
}
