package business.Dashboard;

import entity.ClassRoom;
import entity.Course;
import entity.Student;
import entity.Teacher;
import presentation.UniversityManager;

import java.util.ArrayList;
import java.util.List;

public class All_infor {
    static List<Student> students = UniversityManager.students;
    static List<ClassRoom> classRooms = UniversityManager.classRooms;
    static List<Teacher> teachers = UniversityManager.teachers;
    static List<Course> courses = UniversityManager.courses;
    public static void getClassRoomList() {
        System.out.println("Class room :"+classRooms.size());
        System.out.println("students :"+students.size());
        System.out.println("teachers :"+teachers.size());
        System.out.println("courses :"+courses.size());

    }
}
