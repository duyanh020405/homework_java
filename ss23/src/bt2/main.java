package bt2;

public class main {
    public static void main(String[] args) {
        Thread number1 = new Runnumber();
        Thread number2 = new Runnumber();
        number1.start();
        number2.start();
    }
}
