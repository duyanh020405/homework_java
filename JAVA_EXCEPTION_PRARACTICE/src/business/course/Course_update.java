package business.course;

import entity.Course;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class Course_update {
    static List<Course> courseList = UniversityManager.courses;
    static Scanner scanner = new Scanner(System.in);
    public static void course_update() {
        System.out.print("Enter course ID to update: ");
        String courseID = scanner.nextLine();
        for (Course course : courseList) {
            if(course.getCourseId().equals(courseID)) {
                System.out.print("Enter course name to update (name.length >= 20 && <100): ");
                String courseName = scanner.nextLine();
                System.out.print("Enter course status to update: ");
                String status = scanner.nextLine();
                if(status.equals("true") || status.equals("false") && courseName.length() >= 20 && courseName.length() <= 100) {
                    course.setCourseName(courseName);
                    course.setStatus(Boolean.parseBoolean(status));
                    System.out.print("Successfully updated course !!");
                }
                else {
                    System.out.print("Invalid input !!");
                }
            }
            else {
                System.out.print("Invalid id  to update !!");
            }
        }

    }
}
