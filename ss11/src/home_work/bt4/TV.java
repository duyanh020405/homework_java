package home_work.bt4;

public class TV implements iElectronic {

    @Override
    public void turnOn() {
        System.out.println("turn on TV");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off TV");

    }
}
