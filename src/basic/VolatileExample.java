package basic;

public class VolatileExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (!flag) {
                boolean bool = false;
                System.out.println("T1 thread value "+!bool);
            }
            System.out.println("Flag is true, thread1 ends.");
        });

        Thread t2 = new Thread(() -> {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            flag = true;
            System.out.println("Thread2 set flag to true.");
        });

        t1.start();
        t2.start();
    }
}
