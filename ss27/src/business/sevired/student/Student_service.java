package business.sevired.student;

import business.dao.student.StudentDAO;
import business.dao.student.StudentDAOimp;
import business.model.Student;

import java.util.List;

public class Student_service implements StudentService{
    private final StudentDAO studentDAO;

    public Student_service() {
        studentDAO = new StudentDAOimp();
    }

    @Override
    public List<Student> findAll() {

        return studentDAO.findAll();
    }

    @Override
    public boolean save(Student student) {
        return studentDAO.save(student);
    }

    @Override
    public boolean update(Student student) {
        return studentDAO.update(student);
    }

    @Override
    public boolean delete(Student student) {
        return studentDAO.delete(student);
    }

    @Override
    public int getCountbystate(boolean state, List<Student> students) {
        return studentDAO.getCountStudent(state ,  students);
    }


}
