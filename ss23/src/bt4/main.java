package bt4;

public class main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread2 thread2 = new MyThread2();
        MyThread3 thread3 = new MyThread3();
        System.out.println("Thread_1 run :");
        thread.start();
        try {
            thread.join();
        }
        catch (InterruptedException e) {
            System.out.println("Thread_1 interrupted");
        }
        thread2.start();
        thread3.start();
    }
}
