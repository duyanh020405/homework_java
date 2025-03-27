import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Sv001","Nguyen Van A",20);
        Student student2 = new Student("Sv002","Nguyen Van B",21);
        Student student3 = new Student("Sv003","Nguyen Van C",20);
        Student student4 = new Student("Sv004","Nguyen Van D",23);
        Student student5 = new Student("Sv005","Nguyen Van E",20);

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        /* B1 : chuyen tu collection -> stream
        *  B2 Thao tac trung gian
        *  B3 Thao tac dau cuoi , in hoac luu du lieu
        * */
        System.out.println("Thong tin cac sinh vien co tuoi > 20 ");
        students.stream().filter(s->s.getAge()>20).forEach(s -> System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Age: " + s.getAge()));

        // skip va limit as sql workbench

        //sap xep tang dan , use comparator.comparing(Student::getAge)
        //sap xep giam dan . use- theo tuoi giam dan - them revered comparator.comparing(Student::getAge).revered

        //sap xep tuoi tang dan , ten giam dan
        //.then...

        //anyMath use :






    }
}
