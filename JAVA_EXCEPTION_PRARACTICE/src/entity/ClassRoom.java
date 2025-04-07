package entity;

import presentation.UniversityManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassRoom implements IApp {
    public static List<ClassRoom> classRooms = UniversityManager.classRooms;
    Scanner sc = new Scanner(System.in);
    private static int auto = 0 ;
    int classRoomId;
    String classRoomName = "";
    String courseId = "";
    int teacherId = 0;
    List<Student> listStudents ;
    LocalDate created ;
    Status status ;

    public ClassRoom() {

    }

    public enum Status {
        PENDING, PROGESS, CLOSE
    }
    public ClassRoom (String classRoomName, String courseId, int teacherId, List<Student> listStudents, LocalDate created, Status status) {
        this.classRoomId = ++auto;
        this.classRoomName = classRoomName;
        this.courseId = courseId;
        this.teacherId = teacherId;
        this.listStudents = listStudents;
        this.created = created;
        this.status = status;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getClassRoomName() {
        return classRoomName;
    }

    public void setClassRoomName(String classRoomName) {
        this.classRoomName = classRoomName;
    }

    public int getClassRoomId() {
        return classRoomId;
    }

    public void setClassRoomId(int classRoomId) {
        this.classRoomId = classRoomId;
    }
    public void inputData(Scanner scanner) {
        List<Course> courseList = UniversityManager.courses;
        List<Teacher> teacherList = UniversityManager.teachers;
        List<Student> allStudents = UniversityManager.students;

        System.out.println("Enter ClassRoom Name (name.length > 15 and name.length < 50): ");
        String name = sc.nextLine();

        System.out.println("Enter Course ID: ");
        String courseId = sc.nextLine();

        System.out.println("Enter Teacher ID: ");
        int teacherId = sc.nextInt();
        sc.nextLine();

        List<Student> students_classroom = new ArrayList<>();
        System.out.println("Enter number of students in the classroom: ");
        int listStudentsSize = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < listStudentsSize; i++) {
            System.out.println("Enter Student ID: ");
            String studentId = sc.nextLine();
            boolean found = false;

            for (Student student : allStudents) {
                if (student.getIdStudent().equals(studentId)) {
                    students_classroom.add(student);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Invalid Student ID: " + studentId);
            }
        }

        if (name.length() > 15 && name.length() < 50) {
            boolean courseFound = false;
            for (Course course : courseList) {
                if (course.getCourseId().equals(courseId)) {
                    courseFound = true;
                    boolean teacherFound = false;
                    for (Teacher teacher : teacherList) {
                        if (teacher.getTeacherId() == teacherId || teacherId == 0) {
                            teacherFound = true;
                            this.classRoomId = ++auto;
                            this.classRoomName = name;
                            this.courseId = courseId;
                            this.teacherId = teacherId;
                            this.listStudents = students_classroom;
                            this.status = Status.PENDING;
                            this.created = LocalDate.now();
                            System.out.println("ClassRoom created successfully!");
                            break;
                        }
                    }
                    if (!teacherFound) {
                        System.out.println("Invalid Teacher ID: " + teacherId);
                    }
                    break;
                }
            }
            if (!courseFound) {
                System.out.println("Invalid Course ID: " + courseId);
            }
        } else {
            System.out.println("Class name must be between 15 and 50 characters.");
        }
    }

}
