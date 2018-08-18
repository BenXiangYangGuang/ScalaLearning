/**
 * Author: wewe
 * Date:  18-8-11 上午11:51
 * Description:线程变量可见性
 * Refer To:
 */
public class VisibilityTest {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!ready) {
                System.out.println(ready);
            }
            System.out.println(number);
        }
    }

    private static class WriterThread extends Thread {
        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number = 100;
            ready = true;
        }
    }

    public static void main(String[] args) {
        new WriterThread().start();
        new ReaderThread().start();
    }
}