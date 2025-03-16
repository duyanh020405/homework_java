package home_work.bt4;

public class Radio implements iElectronic {

    @Override
    public void turnOn() {
        System.out.println("Radio turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turn off");

    }
}
