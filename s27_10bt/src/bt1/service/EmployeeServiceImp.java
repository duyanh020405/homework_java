package bt1.service;

import bt1.business.dao.EmployeesDao;
import bt1.business.dao.EmployeesDaoImp;
import bt1.modle.Employees;

import java.util.List;

public class EmployeeServiceImp implements EmployeeServiceI {

    private final EmployeesDao employeesDao;

    public EmployeeServiceImp() {
        employeesDao = new EmployeesDaoImp();
    }

    @Override
    public List<Employees> findAll() {
        return List.of();
    }

    @Override
    public Employees findById(int id) {
        return (Employees) employeesDao.findById(id);
    }
}
