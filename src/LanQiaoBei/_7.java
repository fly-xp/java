package LanQiaoBei;

import java.util.Scanner;

public class _7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
