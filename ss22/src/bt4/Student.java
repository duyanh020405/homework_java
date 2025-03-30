package bt4;

import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void display() {
        System.out.println(name + " - Tuổi: " + age + ", Điểm: " + score);
    }
}
