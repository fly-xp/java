package demo.d3;

public class TestThread extends Thread {
    @Override
    public void run() {
        //super.run();
        for (int i = 0; i < 6; i++) {
            System.out.println("run method" + i);
        }

    }
}
