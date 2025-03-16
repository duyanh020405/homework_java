public class bt9 {
    static abstract class Vehicle {
        abstract void move();
        abstract void sound();

        double move(int time, int speed) {
            return time * speed;
        }
    }

    static class Car extends Vehicle {
        void move() { System.out.println("Car run"); }
        void sound() { System.out.println("Vroom"); }
    }

    static class Bike extends Vehicle {
        void move() { System.out.println("Bike run."); }
        void sound() { System.out.println("Ring Ring"); }
    }

    static class Bus extends Vehicle {
        int seats;
        Bus(int seats) {
            this.seats = seats;
        }

        void move() { System.out.println("Bus run " + seats); }
        void sound() { System.out.println("Honk"); }
    }

    static class Airplane extends Vehicle {
        int altitude;
        Airplane(int altitude) {
            this.altitude = altitude;
        }

        void move() { System.out.println("Airplane fly " + altitude); }
        void sound() { System.out.println("Whoosh"); }
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus(50);
        Vehicle airplane = new Airplane(30000);

        int carTime = 2, carSpeed = 60;
        int bikeTime = 1, bikeSpeed = 15;
        int busTime = 3, busSpeed = 50;
        int airplaneTime = 5, airplaneSpeed = 800;

        car.move();
        car.sound();
        System.out.println("Moved: " + car.move(carTime, carSpeed));

        bike.move();
        bike.sound();
        System.out.println("Moved: " + bike.move(bikeTime, bikeSpeed));

        bus.move();
        bus.sound();
        System.out.println("Moved: " + bus.move(busTime, busSpeed));

        airplane.move();
        airplane.sound();
        System.out.println("Moved: " + airplane.move(airplaneTime, airplaneSpeed));
    }
}
