

public class Main{
    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread();
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread thread1 = new Thread(oddThread);
        Thread thread2 = new Thread(evenThread);
        System.out.println("main start");
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println("main end");
    }
}