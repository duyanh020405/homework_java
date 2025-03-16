package home_work;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void sound();
    abstract void move();
}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Roar!");
    }

    @Override
    void move() {
        System.out.println(name + " is running");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Trumpet!!");
    }

    @Override
    void move() {
        System.out.println(name + " is walking");
    }
}

class Zoo {
    private Animal[] animals;

    public Zoo() {
        animals = new Animal[] {
                new Lion("Simba", 5),
                new Elephant("Dumbo", 10),
                new Lion("Mu", 8),
                new Elephant("PSG", 7)
        };
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.name + ", Age: " + animal.age);
            animal.sound();
            animal.move();
        }
    }
}

public class bt6 {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.displayAnimals();
    }
}
