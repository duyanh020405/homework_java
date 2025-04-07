package business.course;

import entity.Course;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class Course_add {
    static List<Course> courseList = UniversityManager.courses;
    static Scanner scanner = new Scanner(System.in);

    public static void add_course() {
        Course course = new Course();
        course.inputData(scanner);
        courseList.add(course);
        System.out.println("Successfully");
    }
}
