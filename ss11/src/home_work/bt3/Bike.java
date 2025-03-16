package home_work.bt3;

public class Bike extends Vehicle {
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void displayinfor() {
        System.out.println(name+ speed);

    }
}
