package demo.d2;

public class Test {
    public static void main(String[] args) {
//        Single s=Single.getInstance();
//        Single1 s1=Single1.getInstance();
//        SubTem t=new SubTem();
//        t.getTime();
        BWM b3 = new BWM3Factory().productBWM();
        b3.showInfo();
        BWM b5 = new BWM5Factory().productBWM();
        b5.showInfo();
    }


}
