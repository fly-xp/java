package demo.d3;

public class Test1 {
    public static void main(String[] args) {
//        Thread t=new TestThread();
//        t.start();
//        Thread t2=new TestThread();
//        t2.start();
        Thread t0 = new Thread(new TestRunnable());
        t0.start();
        Thread t1 = new Thread(new TestRunnable(), "t-1");
        t1.start();
        System.out.println("===============1");
        System.out.println("===============2");
        System.out.println("===============3");
//        Thread t1=new TestThread();
//        t1.start();
    }
}
