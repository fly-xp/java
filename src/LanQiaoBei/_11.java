package LanQiaoBei;

import java.util.Scanner;

public class _11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrs = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arrs[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            if (a == arrs[i]) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("-1");
    }

}


