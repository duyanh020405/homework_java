public class bt3 {
   static class  Animal {
        public void makeSound() {
            System.out.println("some sound");
        }
    }
    static class Dog extends Animal {
        public void makeSound() {
            System.out.println("Woof Woof");
        }
    }

   static class Cat extends Animal {
        public void makeSound() {
            System.out.println("Meow Meow");
        }
    }

    static  public  void main(String[] args) {
        Dog dog  = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
