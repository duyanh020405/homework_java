package business.dao;

import business.model.Student;

import java.util.List;

public interface AppDao <T>{
    List<T> findAll();
    boolean save(T t);
    boolean update(T t);
    boolean delete(T t);
    int getCountStudent(Boolean b , List<Student> students);
}
