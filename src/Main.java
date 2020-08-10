import java.util.concurrent.TimeUnit;

/**
 * @author wupx
 * @date 2019/10/25
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new InterruptThread());
        thread.start();
        System.out.println("main线程启动了");
        TimeUnit.MILLISECONDS.sleep(100);
        thread.interrupt();
    }

    public static class InterruptThread implements Runnable {
        @Override
        public void run() {
//阻塞
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("我被中断了");
                    return;
                }
                System.out.println("我会一直执行直到interrupt()方法被调用");
            }

        }

       
    }
    
}
