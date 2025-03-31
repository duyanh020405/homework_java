package bt5;

public class main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        new Writer(sharedData).start();
        new Reader(sharedData).start();
    }
}