package ss10.src.bt7;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(3.5, "B23TC", "Bui Van B");
        GraduateStudent student2 = new GraduateStudent(3.8, "B23TXT", "Trần Van An", "CNTT", "Nguyễn Văn Duong");
        Student[] students = {student1, student2};

        for (Student s : students) {
            System.out.println(s.getDetails());
        }
    }
}
