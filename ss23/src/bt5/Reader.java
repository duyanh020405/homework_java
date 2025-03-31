package bt5;

public class Reader  extends Thread {
    private SharedData data;
    public Reader(SharedData data) { this.data = data; }

    public void run() {
        String msg;
        do {
            msg = data.read();
            System.out.println("Reader: " + msg);
        } while (!msg.equals("DONE"));
    }
}
