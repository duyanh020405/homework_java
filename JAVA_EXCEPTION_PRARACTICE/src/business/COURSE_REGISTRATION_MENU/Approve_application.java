package business.COURSE_REGISTRATION_MENU;

import entity.CourseRegistration;
import presentation.UniversityManager;

import java.util.List;
import java.util.Scanner;

public class Approve_application {
    public static Scanner sc = new Scanner(System.in);
    static List<CourseRegistration> courseRegistrations = UniversityManager.courseRegistrations;
    public static void approve_application() {
        System.out.println("Enter student id: ");
        String student_id = sc.nextLine();
        for (CourseRegistration courseRegistration : courseRegistrations) {
            if(courseRegistration.getStudentId().equals(student_id)) {
                if(courseRegistration.getStatus().equals(CourseRegistration.status.PENDING)){
                    courseRegistration.setStatus(CourseRegistration.status.ENROLLED);
                    System.out.println("Success");
                }
                else {
                    System.out.println("status different PENDING");
                    break;
                }
            }
            else {
                System.out.println("Id different or Id repeated");
                break;
            }

        }
    }
}
