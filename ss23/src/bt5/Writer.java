package bt5;

public class Writer extends Thread {
    private SharedData data;
    public Writer(SharedData data) { this.data = data; }

    public void run() {
        String[] messages = {"Xin chao"};
        for (String msg : messages) {
            data.write(msg);
            System.out.println("Writer: " + msg);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
        data.write("DONE");
    }
}
