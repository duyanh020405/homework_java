package business.sevired.student;

import business.model.Student;
import business.sevired.Appservirce;

import java.util.List;

public interface StudentService extends Appservirce<Student> {
    boolean save(Student student);

    int getCountbystate(boolean state, List<Student> students);
}
