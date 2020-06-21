package demo.d3;

public class Test3 {
    public static void main(String[] args) {
        Acount a = new Acount();
        Acount a1 = new Acount();
        User u1 = new User(a, 2000);
        User u2 = new User(a1, 2000);
        Thread wechat = new Thread(u1, "微信");
        Thread alipay = new Thread(u1, "支付宝");
        wechat.start();
        alipay.start();

        /*try {
            alipay.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

    }
}

class Acount {
    public static int money = 3000;
    /*
     * 在普通方法上加synchronized同步锁，锁的是整个对象，不是某个方法
     * 不同对象就是不同的锁，如果不同对象继续使用普通方法加synchronized，线程
     * 使用不同的此方法的对象，还有共享资源的问题*/

    public synchronized void drawing(int m) {
        String name = Thread.currentThread().getName();

        if (money < m) {
            System.out.println(name + "dont't have enough money" + money);
        } else {

            System.out.println(name + " operate,oringinal money:" + money);
            System.out.println(name + " operate,take money:" + m);
            money = money - m;
            System.out.println(name + " operate,rest of money:" + money);
        }
    }

    /*
     * synchronized (a),这个小括号中传入不同的对象就是不同的锁*/
    public synchronized void drawing3(int m, Acount a) {
        synchronized (a) {
            String name = Thread.currentThread().getName();

            if (money < m) {
                System.out.println(name + "dont't have enough money" + money);
            } else {

                System.out.println(name + " operate,oringinal money:" + money);
                System.out.println(name + " operate,take money:" + m);
                money = money - m;
                System.out.println(name + " operate,rest of money:" + money);
            }
        }
    }

    /*
     * 对代码块加入同步锁
     * 在其他方法中使用synchronized (this)代码块使用的都是同一个同步锁*/
    public synchronized void drawing2(int m) {
        synchronized (this) {//表示当前对象的代码块被加了synchronized同步锁
            String name = Thread.currentThread().getName();

            if (money < m) {
                System.out.println(name + "dont't have enough money" + money);
            } else {

                System.out.println(name + " operate,oringinal money:" + money);
                System.out.println(name + " operate,take money:" + m);
                money = money - m;
                System.out.println(name + " operate,rest of money:" + money);
            }
        }
    }

    /*
     * static的方法加上synchronized，对于所有对象都是同一个一个锁*/
    public static synchronized void drawing1(int m) {
        String name = Thread.currentThread().getName();

        if (money < m) {
            System.out.println(name + "dont't have enough money" + money);
        } else {

            System.out.println(name + " operate,oringinal money:" + money);
            System.out.println(name + " operate,take money:" + m);
            money = money - m;
            System.out.println(name + " operate,rest of money:" + money);
        }
    }

    /*public synchronized void drawing1(int m) {
        String name = Thread.currentThread().getName();
        if (money < m) {
            System.out.println(name + "dont't have enough money" + money);
        } else {

            System.out.println(name + " operate,oringinal money:" + money);
            System.out.println(name + " operate,take money:" + m);
            money = money - m;
            System.out.println(name + " operate,rest of money:" + money);
        }
    }*/

}

class User implements Runnable {
    public User(Acount acount, int money) {
        this.acount = acount;
        this.money = money;
    }

    Acount acount;
    int money;

    @Override
    public void run() {
//        if (Thread.currentThread().getName().equals("微信")) {
//            acount.drawing(money);
//        } else {
//            acount.drawing1(money);
//        }
        acount.drawing3(money, acount);
    }
}