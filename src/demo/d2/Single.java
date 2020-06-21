package demo.d2;

/*
* 饿汉式
* 懒汉式和饿汉式的区别：就是什么时候new这个对象
* 懒汉式：是在第一次调用getInstance方法时来new对象，以后再有人调用getInstance方法
就返回第一次new好的对象
饿汉式：是在类加载之后，还没有人调用的时候，就先new好一个对象，以后不论谁来调用getInstance方法，
就直接返回之前new好的那个对象
* */
public class Single {
    //私有的构造，构造方法私有化，调用这个类不能直接使用new来创建对象
    private Single() {
    }

    private static Single single = new Single();

    public static Single getInstance() {
        return single;
    }
}
