package business.COURSE_REGISTRATION_MENU;

import entity.CourseRegistration;
import presentation.UniversityManager;
import java.util.List;
import java.util.Scanner;

public class Cancel_register_course {
    public static List<CourseRegistration> courseRegistrations = UniversityManager.courseRegistrations;
   static Scanner sc = new Scanner(System.in);
   public static void cancel_register_course() {
       System.out.println("Enter student id: ");
       String student_id = sc.nextLine();
       for (CourseRegistration courseRegistration : courseRegistrations) {
           if(courseRegistration.getStatus() == CourseRegistration.status.PENDING){
               if(courseRegistration.getStudentId().equals(student_id)) {
                   courseRegistrations.remove(courseRegistration);
                   System.out.println("Cussess");
                   break;
               }
               else {
                   System.out.println("Wrong student id");
                   break;
               }
           }
           else {
               System.out.println("status isn't pending");
           }


       }
   }
}
