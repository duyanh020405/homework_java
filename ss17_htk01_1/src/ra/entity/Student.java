package ss17_htk01_1.src.ra.entity;

import java.util.Scanner;

public class Student {
    private String student_id;
    private String studentName;
    private String birthday;
    private String phoneNumber;
    private boolean sex;
    private String email;
    private String major;
    private String className;
    private Float gpa;
    private byte status;

    public Student() {
    }

    public Student(String student_id, byte status, Float gpa, String className, String major, String email, boolean sex, String phoneNumber, String birthday, String studentName) {
        this.student_id = student_id;
        this.status = status;
        this.gpa = gpa;
        this.className = className;
        this.major = major;
        this.email = email;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.studentName = studentName;
    }

    public String getStudent_id() {
        return student_id;
    }

    // theo id
    private boolean isValidId(String id) {
        if (id == null || id.length() != 7) {
            return false;
        }
        if (!id.startsWith("SV")) {
            return false;
        }
        for (int i = 2; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public void setStudent_id(String student_id) {
        this.student_id = isValidId(student_id) ? student_id : null;
    }

    // theo status

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        if (status == 1 || status == 2 || status == 3) {
            this.status = status;
        }
        else {
            System.err.println("Status khong dung");
        }
    }

    // Theo gpa

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
        }else{
            System.err.println("Gpa khong dung");
        }
    }

    /// class name
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        if(!className.trim().isEmpty()){
            this.className = className;
        }
        else{
            System.err.println("ClassName khong dung");
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if(!major.trim().isEmpty()){
            this.major = major;
        }
        else{
            System.err.println("Major khong dung");
        }
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            this.email = email;
        }
        else{
            System.err.println("Email khong dung");
        }

    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        if(sex == true){
            this.sex = true;
        }
        else if(sex == false){
            this.sex = false;
        }
        else{
            System.out.println("Sex khong nhap dung dinh dang");
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phone) {
        if (phone.charAt(0) == '0' && (phone.length() == 10 || phone.length() == 11)) {
            for (int i = 1; i < phone.length()-1; i++) {
                if (!Character.isDigit(phone.charAt(i))) {
                    this.phoneNumber = phone;
                }
                else{
                    System.out.println("PhoneNumber khong dung");
                }
            }
        }
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = isValidDate(birthday) ? birthday : null;
    }
    private boolean isValidDate(String date) {
        return date != null && date.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName.trim().isEmpty() ? null : studentName;
    }

    public static Student InputData(Scanner sc) {
        System.out.println("Nhập mã sinh viên:");
        String studentId = sc.nextLine().trim();

        System.out.println("Nhập tên sinh viên:");
        String studentName = sc.nextLine().trim();

        System.out.println("Nhập ngày sinh:");
        String birthday = sc.nextLine().trim();

        System.out.println("Nhập số điện thoại:");
        String phoneNumber = sc.nextLine().trim();

        System.out.println("Nhập email:");
        String email = sc.nextLine().trim();

        System.out.println("Nhập giới tính:");
        boolean sex = sc.nextBoolean();
        sc.nextLine();

        System.out.println("Nhập ngành học:");
        String major = sc.nextLine().trim();

        System.out.println("Nhập tên lớp:");
        String className = sc.nextLine().trim();

        System.out.println("Nhập GPA:");
        Float gpa = Float.parseFloat(sc.nextLine().trim());
        sc.nextLine();

        System.out.println("Nhập trạng thái (1: Đang học, 2: Bảo lưu, 3: Tốt nghiệp):");
        byte status = Byte.parseByte(sc.nextLine().trim());


        return new Student(studentId, status, gpa, className, major, email, sex, phoneNumber, birthday, studentName);
    }

    public String  display() {
        System.out.println("Student ID : " + student_id);
        System.out.println("Student Name : " + studentName);
        System.out.println("Birthday : " + birthday);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email : " + email);
        System.out.println("Status : " + status);
        System.out.println("GPA : " + gpa);
        System.out.println("ClassName : " + className);
        System.out.println("Major : " + major);
        return student_id+","+studentName+","+birthday+","+phoneNumber;
    }
}
