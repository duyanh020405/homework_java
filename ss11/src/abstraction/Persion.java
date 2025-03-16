package abstraction;

import java.util.Scanner;

public abstract class Persion {
    public abstract int addTwoNumber(int firstNumber , int secondNumber);
    private String name ;
    public int age ;
    public boolean sex ;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void hello();

    public void inputData(Scanner scanner) {
        System.out.println("Enter the name of the shape : ");
        name = scanner.next();
        System.out.println("Name : " + name);
    }
}
