package LanQiaoBei;

import java.util.Scanner;

public class _20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = 0;
        temp = Math.max(a, b);
        temp = Math.max(temp, c);
        System.out.println(temp);
    }
}
