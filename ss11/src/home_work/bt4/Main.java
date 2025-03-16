package home_work.bt4;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Radio radio = new Radio();

        radio.turnOn();
        radio.turnOff();
        tv.turnOn();
        tv.turnOff();
    }
}
