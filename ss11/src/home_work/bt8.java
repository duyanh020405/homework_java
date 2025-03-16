package home_work;

import java.util.ArrayList;
import java.util.List;

public class bt8 {
    static abstract class Car{
        String model;
        int year;
        double price;

        public Car(String model, int year, double price) {
            this.model = model;
            this.year = year;
            this.price = price;
        }

        abstract String start();
        abstract String stop();
    }

    interface Refuelable {
        String refuel();
    }

    static class ElectricCar extends Car implements Refuelable {
        public ElectricCar(String model, int year, double price) {
            super(model, year, price);
        }

        @Override
        public String start() {
            return "Xe điện " + model + "(Năm SX: " + year + " Giá: "+ price +" đã khởi động không tiếng ồn.";
        }

        @Override
        public String stop() {
            return "Xe điện " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đã dừng và ngắt kết nối động cơ.";
        }

        @Override
        public String refuel() {
            return "Xe điện " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đang sạc điện…";
        }
    }

    // Lớp GasCar
    static class GasCar extends Car implements Refuelable {
        public GasCar(String model, int year, double price) {
            super(model, year, price);
        }

        @Override
        public String start() {
            return "Xe chạy xăng " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đã khởi động với tiếng động cơ.";
        }

        @Override
        public String stop() {
            return "Xe chạy xăng " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đã dừng và động cơ tắt";
        }

        @Override
        public String refuel() {
            return "Xe chạy xăng " + model + " (Năm SX: " + year + ", Giá: $" + price + ") đang được đổ xăng...";
        }
    }

    static class Garage {
        private List<Car> cars = new ArrayList<>();

        public void add(Car car) {
            cars.add(car);
        }
        public Car getCar(int index) {
            return cars.get(index);
        }
        public void start(){
            for (Car car : cars) {
                System.out.println(car.start());
            }
        }
        public void stop() {
            for (Car car : cars) {
                System.out.println(car.stop());
            }
        }
        public void refuel() {
            for (Car car : cars) {
                    if ( car instanceof Refuelable) {
                        System.out.println(((Refuelable) car).refuel());
                    }
            }
        }
    }

    public static void main(String[] args) {
        Garage garages = new Garage();
        ElectricCar car_1 = new ElectricCar("Honda",2013,3000);
        GasCar car_2 = new GasCar("Kia Morning",2012,300);
        garages.add(car_1);
        garages.add(car_2);
        garages.start();
        garages.refuel();
        garages.stop();
    }
}
