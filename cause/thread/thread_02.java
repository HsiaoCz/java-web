package cause.thread;

public class thread_02 {
    public static void main(String[] args) {
        // create thread
        Thread t = new Thread();

        // start thread
        t.start();

        // main方法运行在main线程中
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Mythread:" + Thread.currentThread().getName());
    }
}