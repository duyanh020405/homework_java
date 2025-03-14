package ss10.src;

public class Test_Car extends Car{

    public Test_Car(String make, String model, int year) {
        super(make, model, year);
    }

    public static void main(String[] args) {
        Car new_car = new Car("Toyota", "BMW", 2016);
        Car new_car2 = new Car("Yamaha", "BTX", 2016);
        new_car.setYear(2026);
        new_car2.checkYear();
        new_car.checkYear();
    }
}
