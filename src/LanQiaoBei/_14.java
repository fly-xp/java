package LanQiaoBei;

public class _14 {
    public static void main(String[] args) {
        for (int i = 1000; i < 9999; i++) {
            if ((i / 1000) == (i % 10) && ((i % 1000) / 100) == ((i % 100) / 10)) {
                System.out.println(i);
            }
        }
    }
}
