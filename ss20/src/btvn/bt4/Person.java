package btvn.bt4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    String name;
    LocalDate birthday;
    int age;
    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        this.age = (int) ChronoUnit.YEARS.between(birthday, LocalDate.now());
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthday);
    }
}
