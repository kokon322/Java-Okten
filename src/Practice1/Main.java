package Practice1;

public class Main {

    public static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread("Full-thread-1", "Igor");
//        myThread.start();

//        Runnable runnable = () -> {
//            try {
//                for (int i = 0; i < 5; i++) {
//                    Thread.sleep(1000);
//                    System.out.println(Thread.currentThread().getName() + ": " + i);
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        };
//
//        Runnable runnable2 = () -> {
//            for (int i = 0; i < 10; i++) {
//                try {
//                    Thread.sleep(500);
//                    System.out.println(Thread.currentThread().getName() + ": " + i);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        };
//
//        Thread thread1 = new Thread(runnable, "My-Tread-1");
//        Thread thread2 = new Thread(runnable2, "My-Tread-2");
//
//        thread1.start();
//        thread1.join();
//
//        thread2.start();
//        thread2.join();
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println(Thread.currentThread().getName() + ": " + i);
//        }

        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("value: "+ i);
            }
            flag = false;
            System.out.println("Flag status change to: "+  flag);
        });

        Thread thread1 = new Thread(()->{
            int x =0;
            while(flag){
                x++;
            }
            System.out.println("value X : "+x);
        });
        thread.start();
        thread1.start();

    }
}
