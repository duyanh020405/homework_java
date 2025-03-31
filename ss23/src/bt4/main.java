package bt4;

public class main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread thread2 = new MyThread();
        MyThread thread3 = new MyThread();
        System.out.println("Thread_1 run :");
        thread.start();
        try {
            thread.join();
        }
        catch (InterruptedException e) {
            System.out.println("Thread_1 interrupted");
        }
        System.out.println("Thread_2 run:");
        thread2.start();

        System.out.println("Thread_3 run:");
        thread3.start();

    }
}
