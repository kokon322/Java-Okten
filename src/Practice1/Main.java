package Practice1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread("Full-thread-1", "Igor");
//        myThread.start();

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": "+ i);
            }
        };
        Thread thread = new Thread(runnable, "My-Tread-1");
        thread.start();
        thread.join();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": "+ i);
        }

    }
}
