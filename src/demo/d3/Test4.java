package demo.d3;

public class Test4 {
    public static void main(String[] args) {
        Clerk c = new Clerk();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {
                        if (c.productNum == 0) {

                            System.out.println("begin product");
                            while (c.productNum < 4) {
                                c.productNum++;
                                System.out.println("store" + c.productNum);
                            }
                            System.out.println("product number" + c.productNum + "ending");
                            c.notify();
                        } else {
                            try {
                                c.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "productor").start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (c) {
                    while (true) {
                        if (c.productNum != 0) {

                            System.out.println("begin buy");
                            while (c.productNum > 0) {
                                c.productNum--;
                                System.out.println("store:" + c.productNum);
                            }
                            System.out.println("product number" + c.productNum + "ending");
                            c.notify();
                        } else {
                            try {
                                c.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }, "consumer").start();
    }
}

class Clerk {
    public static int productNum = 0;
}
