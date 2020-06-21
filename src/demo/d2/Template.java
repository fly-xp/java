package demo.d2;

/*
 * 模板设计模式
 * */
public abstract class Template {
    public abstract void code();

    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("time is:" + (end - start));
    }

}

class SubTem extends Template {
    int k = 0;

    @Override
    public void code() {
        for (int i = 0; i < 50000; i++) {
            k += 1;
        }
        System.out.println(k);
    }
}
