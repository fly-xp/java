package LanQiaoBei;

import java.util.Scanner;

public class _18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            int[] arr = new int[55];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            for (int i = 3; i < a; i++) {
                arr[i] = arr[i - 1] + arr[i - 3];

            }
            System.out.println(arr[a - 1]);
        }
    }
}
