package entity;

import java.time.LocalDate;

public class CourseRegistration {
    int auto = 0;
    int crid;
    String studentId ;
    String courseId;
    LocalDate date;
    status status;
    public enum status {
        PENDING, ENROLLED, DROPPED
    }
    public CourseRegistration( String studentId, String courseId, LocalDate date , status status ) {
        this.crid = ++auto ;
        this.studentId = studentId;
        this.courseId = courseId;
        this.date = date;
        this.status = status;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getCrid() {
        return crid;
    }

    public void setCrid(int crid) {
        this.crid = crid;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
