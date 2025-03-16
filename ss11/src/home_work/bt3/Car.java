package home_work.bt3;
 class Car extends Vehicle {

     public Car(String name, int speed) {
         super(name, speed);
     }

     @Override
     public void displayinfor() {
         System.out.println(name+ speed);
     }
 }
