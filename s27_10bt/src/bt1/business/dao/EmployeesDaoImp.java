package bt1.business.dao;
import bt1.modle.Employees;
import bt1.config.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class EmployeesDaoImp implements EmployeesDao {
    @Override
    public List<Employees> findAll() {
        return List.of();
    }

    @Override
    public Object findById(int id) {
        Connection con = null;
        CallableStatement cs = null;
        Employees employee = null;
        try{
            con = ConnectionDB.openConnection();
            cs = con.prepareCall("{call find_by_id(?)}");
            cs.setInt(1, id);
            ResultSet rs = cs.executeQuery();

            if (rs.next()) {
                employee = new Employees();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setSalary(rs.getInt("salary"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return employee;
    }
}
