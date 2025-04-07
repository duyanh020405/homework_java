package business.classroom;

import entity.ClassRoom;
import entity.Teacher;
import presentation.UniversityManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassRoom_teacher_division {
    public static List<Teacher> teachers = UniversityManager.teachers;
    public static List<ClassRoom> classRoomList = UniversityManager.classRooms;
    static Scanner sc = new Scanner(System.in);
    public static void classRoom_teacher_division() {
        List<Integer> id_teachers = new ArrayList<>();
        List<String> id_classrooms = new ArrayList<>();
        for (ClassRoom cr : classRoomList) {
            id_classrooms.add(cr.getClassRoomId());
        }
        for(Teacher teachers : teachers){
            id_teachers.add(teachers.getTeacherId());
        }
        if(id_teachers.isEmpty()){
            System.out.println("No teachers in here");
        }
        else {
            if(id_classrooms.isEmpty()){
                System.out.println("No classrooms in here");
            }
            else {
                System.out.println("All teachers_id in here");
                for(Integer id_teacher : id_teachers){
                    System.out.println(id_teacher);
                }
                System.out.println("All classrooms_id in here");
                for(String cr : id_classrooms){
                    System.out.println(cr);
                }
                System.out.println("Enter id teacher to add classroom");
                int id = sc.nextInt();
                System.out.println("Enter id classroom to add teacher");
                String classroomId = sc.nextLine();
                for(String cr : id_classrooms){
                    if(cr.equals(classroomId)){
                        for(Integer id_teacher : id_teachers){
                            if(id_teacher == id){
                                for(ClassRoom classRoomAddTeacher : classRoomList){
                                    if(classRoomAddTeacher.getClassRoomId().equals(cr)){
                                        classRoomAddTeacher.setTeacherId(id);
                                        id_teachers.remove(id);
                                        id_classrooms.remove(classroomId);
                                        System.out.println("Success add teacher");
                                    }
                                }
                            }
                            else {
                                System.out.println("Class room id doesn't match");
                            }
                        }
                    }else {
                        System.out.println("Classroom id doesn't match");
                    }
                }

            }
        }



    }
}
