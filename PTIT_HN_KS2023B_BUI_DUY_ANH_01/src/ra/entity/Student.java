package ra.entity;
import java.util.Scanner;

public class Student {
    String studentId ;
    String studentName ;
    String birthday  ;
    String phoneNumber ;
    boolean sex ;
    String email ;
    String mạjor ;
    String className ;
    float gpa ;
    int status ;

    public Student(String studentId, float gpa, int status, String className, String mạjor, String email, boolean sex, String phoneNumber, String birthday, String studentName) {
        this.studentId = studentId;
        this.gpa = gpa;
        this.status = status;
        this.className = className;
        this.mạjor = mạjor;
        this.email = email;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.studentName = studentName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMạjor() {
        return mạjor;
    }

    public void setMạjor(String mạjor) {
        this.mạjor = mạjor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    static Student inputData(Scanner scanner) {

        System.out.println("Enter student ID: ");
        String studentId = scanner.next();
        scanner.nextLine();
        System.out.println("Enter name student: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter gpa: ");
        float gpa = scanner.nextFloat();
        System.out.println("Enter class: ");
        String className = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter birthday: ( dd/MM/yyyy)");
        String birthday = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter sex - true or false: ");
        boolean sex = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        System.out.println("Enter : major");
        String major = scanner.nextLine();
        System.out.println("Enter status  (1- đang theo học, 2 - bảo lưu, 3 - đã nghỉ học)");
        int status = scanner.nextInt();
        if(!studentName.isEmpty()
            && gpa > 0 && gpa <= 10
            && phoneNumber.length() >=10 || phoneNumber.length() <=11
            && phoneNumber.charAt(0) == '0'
            && sex == true || sex == false
            && !email.isEmpty() && email.contains("@")  && email.contains(".com")
            && !major.isEmpty()
            && status == 1 || status == 2 || status == 3
        ) {
            return  new Student(studentName, gpa, status, className, major, email, sex, phoneNumber, birthday, studentId);
        }
        System.out.println("Thêm không thành công , vui lòng nhập lại ");
        return null;
    }

    Object displayData(Scanner scanner) {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("GPA: " + gpa);
        System.out.println("Class: " + className);
        System.out.println("Birthday: " + birthday);
        System.out.println("Phone Number: " + phoneNumber);
        return "";
    }
}
