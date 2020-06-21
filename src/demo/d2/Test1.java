package demo.d2;

/*内部类
 * 作用：为了实现多重继承
 * */
public class Test1 {
    public static void main(String[] args) {
        A a = new A();
        a.testB();
        a.testC();
    }
}

class A {
    public void testB() {
        new innerB().testB();
    }

    public void testC() {
        new innerC().testC();
    }

    private class innerB extends B {
        @Override
        public void testB() {
            System.out.println("After Override testB");
        }
    }

    private class innerC extends C {
        @Override
        public void testC() {
            System.out.println("After Override testC");
        }
    }
}

class B {
    public void testB() {
    }
}

class C {
    public void testC() {
    }
}

