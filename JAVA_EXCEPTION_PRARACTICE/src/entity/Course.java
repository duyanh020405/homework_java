package entity;

import java.util.Objects;
import java.util.Scanner;

public class Course implements IApp {
    String courseId ;
    String courseName ;
    boolean status ;
    public Course(String courseId, String courseName, String status){
        this.courseId = courseId;
        this.courseName = courseName;
        this.status = Boolean.parseBoolean(status);
    }
    public Course(){

    };

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void inputData(Scanner scanner){
        System.out.print("Enter course ID (start with C and length = 5): ");
        String courseId = scanner.nextLine().trim();
        System.out.print("Enter course Name (name.length >= 20): ");
        String courseName = scanner.nextLine().trim();
        System.out.print("Enter course status (true/false): ");
        String status = scanner.nextLine();
        if(courseId.length() == 5 && courseId.charAt(0) == 'C' && courseName.length() >= 20 && courseName.length() <= 100 && Objects.equals(status, "true") || Objects.equals(status, "false")){
            this.courseId = courseId ;
            this.courseName = courseName;
            this.status = Boolean.parseBoolean(status);
            System.out.println("Successful !!");
        }
        else {
            System.out.println("Wrong input , can create new course !!");

        }

    }

}
