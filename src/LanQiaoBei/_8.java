package LanQiaoBei;

public class _8 {
    public static void main(String[] args) {
//        int a,b,c,d,e;
//        for(a=0;a<2;++a)
//            for(b=0;b<2;++b)
//                for(c=0;c<2;++c)
//                    for(d=0;d<2;++d)
//                        for(e=0;e<2;++e)
//                            System.out.println(a+""+ b+""+ c+""+ d+""+ e);
        for (int i = 0; i < 32; i++) {
            System.out.println(i % 32 / 16 + "" + i % 16 / 8 + "" + i % 8 / 4 + "" + i % 4 / 2 + "" + i % 2);
        }
    }
}
