package business.dao.student;

import business.config.ConnectionDB;
import business.model.Student;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class StudentDAOimp implements StudentDAO {

    @Override
    public List<Student> findAll() {
        Connection conn = null;
        CallableStatement call = null;
        List<Student> students = null;
        try {
            // khoi tao doi tuong connection
            conn = ConnectionDB.oppenConnection();
            // create call tu conn va goi ra
            call = conn.prepareCall("{call find_all_student()}");
            /*
             * executeQuery() thuc hien procedure select
             * excuteUpdate() thuc hien insert , update , delete ma khong co tham so tra ra
             * excure() thuc hien pro co cac tham so tra ra
             * */
            ResultSet rs = call.executeQuery();
            students = new ArrayList<Student>();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt("student_id"));
                student.setName(rs.getString("student_name"));
                student.setAge(rs.getInt("student_age"));
                student.setStatus(rs.getBoolean("student_status"));
                students.add(student);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, call);
        }
        return students;
    }

    @Override
    public boolean save(Student student) {
        Connection conn = null;
        CallableStatement call = null;
        try {
            conn = ConnectionDB.oppenConnection();
            call = conn.prepareCall("{call create_new_student(?,?,?)}");
            call.setString(1, student.getName());
            call.setInt(2, student.getAge());
            call.setBoolean(3,student.isStatus());
            call.executeUpdate();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, call);
        }
        return false;
    }

    @Override
    public boolean update(Student student) {
        Connection conn = null;
        CallableStatement call = null;
        try{
            conn = ConnectionDB.oppenConnection();
            call = conn.prepareCall("{call update_student(?,?,?,?)}");
            call.setInt(1, student.getId());
            call.setString(2, student.getName());
            call.setInt(3, student.getAge());
            call.setBoolean(4, student.isStatus());
            call.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, call);
        }
        return false;
    }

    @Override
    public boolean delete(Student student) {
        Connection conn = null;
        CallableStatement call = null;
        try{
            conn = ConnectionDB.oppenConnection();
            call = conn.prepareCall("{call delete_student(?)}");
            call.setInt(1, student.getId());
            call.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            ConnectionDB.closeConnection(conn, call);
        }
        return false;
    }

    @Override
    public int getCountStudent(Boolean state, List<Student> students) {
        int count = 0;
        for (Student student : students) {
            if (student.isStatus() == state) {
                count++;
            }
        }
        System.out.println("So luong :" +count);
        return count;
    }






}
