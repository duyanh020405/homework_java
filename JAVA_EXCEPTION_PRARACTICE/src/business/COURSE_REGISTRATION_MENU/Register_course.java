package business.COURSE_REGISTRATION_MENU;

import entity.Course;
import entity.CourseRegistration;
import entity.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static entity.CourseRegistration.status.PENDING;

public class Register_course {
    public static List<Student> studentList = new ArrayList<Student>();
    public static List<Course> courseList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void register_course (){
        System.out.println("Enter student id to add register_course: ");
        String student_id = sc.nextLine();
        System.out.println("Enter course id to add register_course: ");
        LocalDate currentDate = LocalDate.now();
        String course_id = sc.nextLine();
        for (Student student : studentList) {
            if(student.getIdStudent().equals(student_id)){
                for (Course course : courseList) {
                    if(course.getCourseId().equals(course_id)){
                        new CourseRegistration(student_id,course_id , currentDate , PENDING);

                        System.out.println("Course Registration Successfull");
                    }
                    else {
                        System.out.println("Course id does not match ");
                        break;
                    }
                }
            }
            else {
                System.out.println("Student id does not match");
                break;
            }
        }

    }
}
