package bt1.business.dao;

import java.util.List;

public interface EmployeesDao<T> {
    List<T> findAll();
    T findById(int id);
}
