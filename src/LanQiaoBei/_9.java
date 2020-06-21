package LanQiaoBei;

import java.util.Scanner;

public class _9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char ch[][] = new char[26][26];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                ch[i][j + i] = (char) ('A' + j);

        for (int i = 0; i < n - 1; i++)
            for (int j = 1; j < n; j++)
                ch[j + i][i] = (char) ('A' + j);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(ch[i][j]);
            System.out.println();
        }
    }
}
