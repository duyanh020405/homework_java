package bt10;

import java.io.Serializable;

class Student implements Serializable {
    int id;
    String name, major;
    double gpa;

    public Student(int id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public String toString() {
        return String.format("ID: %d | %s | %s | GPA: %.2f", id, name, major, gpa);
    }
}

