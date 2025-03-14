package ss10.src;
import java.util.ArrayList;

class Animals {
    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayInfo() {
        System.out.println("Tên: " + name + ", Tuổi: " + age);
    }
    public String makeSound() {
        return "Some generic sound";
    }
}

class Dog extends Animals {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giống: " + breed);
    }

    @Override
    public String makeSound() {
        return "Woof Woof";
    }
}

class Cat extends Animals {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Màu lông: " + furColor);
    }

    @Override
    public String makeSound() {
        return "Meow Meow";
    }
}
public class bt8 {
    public class AnimalManagement {
        public static void main(String[] args) {
            ArrayList<Animals> animalsList = new ArrayList<>();

            animalsList.add(new Dog("Buddy", 3, "Trang Xanh"));
            animalsList.add(new Cat("Milo", 2, "Trắng"));
            animalsList.add(new Dog("Rocky", 4, "Bulldog"));
            animalsList.add(new Cat("Luna", 1, "Đen"));

            for (Animals animal : animalsList) {
                animal.displayInfo();
                    System.out.println("Keu: " + animal.makeSound());
            }
        }
    }
}