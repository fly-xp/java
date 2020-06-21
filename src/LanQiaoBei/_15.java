package LanQiaoBei;

import java.util.Scanner;

public class _15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++)
                for (int k = 0; k <= 9; k++) {
                    if (n == 2 * i + 2 * j + 2 * k) {
                        System.out.println(i + "" + j + "" + k + "" + k + "" + j + "" + i);
                    }
                }

        }
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++)
                for (int k = 0; k <= 9; k++) {
                    if (n == 2 * i + 2 * j + k) {
                        System.out.println(i + "" + j + "" + k + "" + j + "" + i);
                    }
                }

        }
    }
}