package business.sevired;

import business.model.Student;

import java.util.List;

public interface Appservirce<T> {
    List<T> findAll();
    boolean save(T t);
    boolean update(T t);
    boolean delete(T t);
    int getCountbystate(boolean state , List<Student> students);
}
