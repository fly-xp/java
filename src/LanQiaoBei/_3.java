package LanQiaoBei;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] F = new int[1000000];
        F[1] = F[2] = 1;
        for (int i = 3; i < F.length; i++) {
            F[i] = (F[i - 1] + F[i - 2]) % 10007;

        }
        if (n == 1) {
            System.out.println(F[n]);
        } else
            System.out.println(F[n]);

    }
}
