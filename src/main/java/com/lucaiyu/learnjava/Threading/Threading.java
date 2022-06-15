package main.java.com.lucaiyu.learnjava.Threading;

class TestThread implements Runnable{
    private Thread t;
    private String threadName;

    TestThread(String name){
        threadName = name;
        System.out.println("Creating:" + threadName);
    }
    public void run() {
        System.out.println("Running:" + threadName);
        try {
            for (int i = 4; i > 0; i--){
                System.out.println("Thread:" + threadName + "," + i);
                Thread.sleep(50);
            }
        }
        catch (InterruptedException e){
            System.out.println("Thread:" + threadName + " ERROR");
        }
        System.out.println("Thread:" + threadName + " exiting");
    }
    public void start(){
        System.out.println("Starting:" + threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
public class Threading{
    public static void main(String[] args) {
        TestThread t1 = new TestThread("Thread 1");
        t1.start();
        TestThread t2 = new TestThread("Thread 2");
        t2.start();
    }
}
