package bt5;

class SharedData {
    private String message;
    private boolean available = false;

    public synchronized void write(String msg) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        message = msg;
        available = true;
        notify();
    }

    public synchronized String read() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        available = false;
        notify();
        return message;
    }
}