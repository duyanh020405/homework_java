package business.course;

import entity.ClassRoom;
import entity.Course;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class Course_delete {
    static List<Course> courseList = UniversityManager.courses;
    static List<ClassRoom> classRoomList = UniversityManager.classRooms;
    static Scanner scanner = new Scanner(System.in);
    public static void delete_course() {
        System.out.println("Enter course ID");
        String courseID = scanner.nextLine();
        for(ClassRoom classRoom : classRoomList) {
            if(classRoom.getCourseId().equals(courseID)) {
                System.out.println("Can't delete course ");
            }
            else {
                for (Course course : courseList) {
                    if(course.getCourseId().equals(courseID)) {
                        courseList.remove(course);
                        System.out.println("Course deleted");
                        break;
                    }
                    else {
                        System.out.println("Invalid course ID");
                        break;
                    }
                }
            }
        }
    }

}
