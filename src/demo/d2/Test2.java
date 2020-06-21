package demo.d2;
/*
 *
 * */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        System.out.println(set);
        Iterator it = set.iterator();//迭代器遍历
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        for (Object obj : set
                ) {
            System.out.println(obj);

        }
    }
}
