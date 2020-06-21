package LanQiaoBei;


import java.util.Scanner;

public class _5 {
    public static void main(String[] args) {
        long n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {

            sum = sum + i;

        }

        System.out.println(sum);
    }
}
