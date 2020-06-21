package demo.d3;

public class TestRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println(Thread.currentThread().getName() + "runnable method" + i);
        }
    }
}
