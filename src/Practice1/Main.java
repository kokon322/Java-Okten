package Practice1;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    //    public static volatile boolean flag = true;
    public static AtomicInteger a = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread("Full-thread-1", "Igor");
//        myThread.start();
//
//        JOIN
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
//
//        volatile FLAG
//        Thread thread = new Thread(() -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println("value: " + i);
//            }
//            flag = false;
//            System.out.println("Flag status change to: " + flag);
//        });
//
//        Thread thread1 = new Thread(() -> {
//            int x = 0;
//            while (flag) {
//                x++;
//            }
//            System.out.println("value X : " + x);
//        });
//        thread.start();
//        thread1.start();
//
//        volatile INT
//        AtomicInteger
//        Runnable runnable = () -> {
//            while (a.get() < 10) {
//                System.out.println(Thread.currentThread().getName() + " : " + a.incrementAndGet());
//            }
//        };
//        Thread thread = new Thread(runnable, "Thread - 1");
//        Thread thread1 = new Thread(runnable, "Thread - 2");
//
//        thread.start();
//        thread1.start();
//        thread.join();
//        thread1.join();
//        System.out.println(a);

        BankAccount bankAccount = new BankAccount(50);
        CreditCard creditCard1 = new CreditCard(bankAccount);
        CreditCard creditCard2 = new CreditCard(bankAccount);

        CardOwner man = new CardOwner(creditCard1);
        CardOwner woman = new CardOwner(creditCard2);

        Thread manThread = new Thread(man, " Man");
        Thread womanThread = new Thread(woman, " Woman");

        womanThread.start();
        manThread.start();

//        manThread.join();
//        womanThread.join();

    }
}
