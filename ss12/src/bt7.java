public class bt7 {
    static class Vehicle {
        public void move() {
            System.out.println("Vehicle moving");
        }
        public void sound() {
            System.out.println("Vehicle sound");
        }
    }

    static class Car extends Vehicle {
        public void move() {
            System.out.println("Di chuyen nhanh");
        }
        public void sound() {
            System.out.println("Vroom");
        }
    }

    static class Bike extends Vehicle {
        public void move() {
            System.out.println("Di chuyen cham");
        }
        public void sound() {
            System.out.println("Ring Ring");
        }
    }

    static class Bus extends Vehicle {
        public void move() {
            System.out.println("Di chuyen toc do trung binh");
        }
        public void sound() {
            System.out.println("Honk Honk");
        }
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.move();
        bike.sound();
        Bus bus = new Bus();
        bus.move();
        bus.sound();
        Car car = new Car();
        car.move();
        car.sound();
    }
}
