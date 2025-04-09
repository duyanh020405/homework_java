package bt2.service;

import bt2.business.dao.StudentDao;
import bt2.business.dao.StudentDaoImp;
import bt2.modle.Student;

import java.util.List;

public class StudentServiveImp implements StudentService {
    private final StudentDao<Student> studentservice ;
    public StudentServiveImp() {
        studentservice = new StudentDaoImp();
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student save(Student student) {
        return (Student) studentservice.save(student);
    }
}
