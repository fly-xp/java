package LanQiaoBei;

import java.util.Scanner;

public class _19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        double c;
        c = 5.00 * (F - 32) / 9;
        System.out.println("c=" + String.format("%.2f", c));
    }
}
