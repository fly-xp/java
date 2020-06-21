package LanQiaoBei;


import java.util.Arrays;
import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int a[] = new int[100000];
        int k = 0;
        for (int i = 0; i < n; i++) {
            Scanner s = new Scanner(sc.nextLine());
            while (s.hasNext())
                a[k++] = s.nextInt();
        }
        int m1 = 0, m2 = 0;
        Arrays.sort(a, 0, k);
        for (int i = 0; i < k - 1; i++) {
            if (a[i + 1] - a[i] == 2 && a[i] != a[i + 1])
                m1 = a[i] + 1;
            if (a[i] == a[i + 1])
                m2 = a[i];
        }
        System.out.print(m1 + " " + m2);

    }
}



