package demo.d2;
/*通配符*/

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        D d = new D();
        List<String> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        d.test(l1);
        d.test(l2);
        List<C1> lc = new ArrayList<>();
        d.test1(lc);
        List<D1> ld = new ArrayList<>();
        d.test1(ld);
        List<Bb> lb = new ArrayList<>();
        d.test2(lb);
        List<IAImpl> Ia = new ArrayList<>();
        d.test3(Ia);
    }
}

class D {
    public void test(List<?> list) {
        //test方法需要一个list的集合的参数，不确定list集合存的数的类型
    }

    public void test1(List<? extends C1> list) {

    }

    public void test2(List<? super C1> list) {
    }

    public void test3(List<? extends IA> list) {
    }
}

class Aa {
}

class Bb extends Aa {
}

class C1 extends Bb {
}

class D1 extends C1 {
}

interface IA {
}

class IAImpl implements IA {
}