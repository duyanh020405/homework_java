package bt2.business.dao;

import java.util.List;

public interface StudentDao<T>{
    List<T> findAll();
    T save(T t);
}
