package demo.d2;

/*
 * 懒汉式
 * */
public class Single1 {
    @SuppressWarnings({"rawtypes", "unused"})
    private Single1() {
    }

    private static Single1 single1 = null;

    public static Single1 getInstance() {
        if (single1 == null) {
            single1 = new Single1();
        }
        return single1;
    }
}
