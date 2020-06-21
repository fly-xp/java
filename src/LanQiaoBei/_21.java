package LanQiaoBei;

import java.util.Scanner;

public class _21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y;
        if (x < 1) {
            y = x;
        } else if (1 <= x && x < 10) {
            y = 2 * x - 1;
        } else {
            y = 3 * x - 11;
        }
        System.out.println(y);
    }
}
