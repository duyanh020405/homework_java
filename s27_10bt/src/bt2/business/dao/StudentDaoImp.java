package bt2.business.dao;

import bt2.config.ConnectionDB;
import bt2.modle.Student;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;
import java.util.List;

public class StudentDaoImp implements StudentDao<Student> {
    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student save(Student student) {
        Connection conn = null;
        CallableStatement call = null;
        try {
           conn = ConnectionDB.openConnection() ;
            call = conn.prepareCall("{call create_student(?,?,?)}");
            call.setString(1, student.getName());
            call.setInt(2, student.getAge());
            call.setString(3, student.getMajor());
            call.execute();


        }catch (Exception e) {
            e.printStackTrace();
        }

        return student;
    }
}
