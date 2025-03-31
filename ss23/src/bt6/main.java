package bt6;

public class main {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread("Thread 1 Thap");
        PriorityThread thread2 = new PriorityThread("Thread 2 Vua");
        PriorityThread thread3 = new PriorityThread("Thread 3 Cao");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
