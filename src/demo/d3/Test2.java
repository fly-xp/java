package demo.d3;

import jdk.management.resource.internal.inst.ThreadRMHooks;

public class Test2 {
    public static void main(String[] args) {
        TestRun r0 = new TestRun();
        TestRun r1 = new TestRun();
        Thread t0 = new Thread(r0);
        Thread t1 = new Thread(r1);
        //t0.setPriority(1);
        //t1.setPriority(10);
        t0.start();
        t1.start();
        System.out.println("===============1");
        System.out.println("===============2");
        System.out.println(t0.isAlive());
        t0.stop();
        try {
            t0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("===============3");
        System.out.println(t0.isAlive());
        t0.setName("t-0");
        System.out.println(t0.getName());
        System.out.println(t1.getName());
        System.out.println(t0.getPriority());
    }
}

class TestRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
//            if (i%2==0){
//                Thread.yield();//线程让步
//            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "   runnable method" + i);
        }
    }
}
