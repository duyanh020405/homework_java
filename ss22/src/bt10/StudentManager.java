package bt10;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(students);
            System.out.println("Đã lưu danh sách vào " + filename);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file!");
        }
    }

    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            students = (List<Student>) ois.readObject();
            System.out.println("Đã tải danh sách từ " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Lỗi đọc file!");
        }
    }

    public Student findTopStudent() {
        return students.stream().max(Comparator.comparingDouble(s -> s.gpa)).orElse(null);
    }

    public List<Student> searchByMajor(String major) {
        return students.stream().filter(s -> s.major.equalsIgnoreCase(major)).toList();
    }

    public double calculateAverageGpa() {
        return students.stream().mapToDouble(s -> s.gpa).average().orElse(0);
    }

    public void displayAllStudents() {
        students.forEach(System.out::println);
    }
}
