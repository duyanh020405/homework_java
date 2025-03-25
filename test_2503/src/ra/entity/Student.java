package ra.entity;

import java.util.Map;
import java.util.Scanner;

public class Student {
    String id ;
    String name ;
    int age ;
    float avg_score;

    public Student(String id, String name, int age, float avg_score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.avg_score = avg_score;
    }

    public Student(String id, Object obj) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getAvg_score() {
        return avg_score;
    }

    public void setAvg_score(float avg_score) {
        this.avg_score = avg_score;
    }

    public static Student inputData (Scanner sc) {
        sc.nextLine();
        System.out.println("Enter student id: ");
        String id = sc.nextLine();
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        System.out.println("Enter student avg score: ");
        float avg_score = sc.nextFloat();
        if(!name.trim().isEmpty() && age > 0 && avg_score > 0) {
            return new Student(id, name, age, avg_score);
        }
        else {
            System.out.println("Nhap khong dung , vui long thu lai");
            return null;
        }

    }

    public static void deleteStudent (Map<String,Student> s) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student id: ");
        String id = sc.nextLine();
        boolean found = false;
        for(Map.Entry<String,Student> entry : s.entrySet()) {
            if(entry.getValue().getId().equals(id)) {
                s.remove(entry.getKey());
                System.out.println("Student deleted");
                found = true;
            }
        }
        if(!found) {
            System.out.println("Cant't find student with id " + id+"to delete");
        }
    }

}
