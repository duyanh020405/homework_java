package home_work.bt3;

abstract class Vehicle {
     String name;
     int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

   public abstract void displayinfor();
   public void start() {
       System.out.println("Vehicle is starting...");
   }
}
