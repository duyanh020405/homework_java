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

        void move() { System.out.println("Airplane fly" + altitude); }
        void sound() { System.out.println("Whoosh"); }
    }

    static public class Main {
        public void main(String[] args) {
            Vehicle[] vehicles = {new Car(), new Bike(), new Bus(50), new Airplane(30000)};
            int[][] data = {{2, 60}, {1, 15}, {3, 50}, {5, 800}};

            for (int i = 0; i < vehicles.length; i++) {
                vehicles[i].move();
                vehicles[i].sound();
                System.out.println("Moved: " + vehicles[i].move(data[i][0], data[i][1]) );
            }
        }
    }
}
