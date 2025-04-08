package business.dao.student;

import business.dao.AppDao;
import business.model.Student;

import java.util.List;

public interface StudentDAO extends AppDao<Student> {
    int getCountStudent(Boolean b , List<Student> students);
}
