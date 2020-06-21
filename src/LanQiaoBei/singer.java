package LanQiaoBei;

import java.util.Scanner;

public class singer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 1;
        int min = 100;
        int sum = 0;
        int number[] = new int[10];
        int a;
        int aver = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("i" + (i + 1) + ":");
            number[i] = sc.nextInt();
            a = number[i];
            sum = sum + a;
            if (a >= max) {
                max = a;
            }
            if (a <= min) {
                min = a;
            }
            aver = (sum - max - min) / 8;
        }
        System.out.println("max:" + max);
        System.out.println("min:" + min);
        System.out.println("average:" + aver);
    }
}

