package demo.d2;

public class Test4 {
    public static void main(String[] args) {
//A1<Object> a=new A1<Object>();
//A1<String> a1=new A1<String>();
//B1 b1=new B1();
        Cc<Object> c = new Cc<>();
        c.test("xxx");
        c.test1(1);
        c.test1(true);
        c.test2(1, "ssa", true);
        c.test3(1);
    }
}

interface IDD<T> {
    T test(T t);
}

class A1<T> implements IDD<T> {

    @Override
    public T test(T t) {
        return t;
    }
}

class B1 implements IDD<String> {

    @Override
    public String test(String s) {
        return s;
    }
}

class Cc<E> {
    private E e;

    /*
     * 静态方法的泛型*/
    public static <T> void test3(T t) {
//在静态方法中，不能使用类定义泛型，如果要使用泛型，只能使用静态方法定义自己的泛型
        System.out.println(t);
    }

    /*
     * 无返回值的泛型方法*/
    public <T> void test(T s) {
        //在类上定义的泛型，可以在普通的方法中使用
        System.out.println(this.e);
        T t = s;
    }

    /*
     * 有返回值的泛型方法*/
    public <T> T test1(T s) {
        return s;
    }

    /*
     * 无返回值的可变参数泛型方法*/
    public <T> void test2(T... strs) {
        for (T t : strs
                ) {
            System.out.println(t);

        }
    }
}
