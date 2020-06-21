package LanQiaoBei;

import java.util.Scanner;

public class _17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        char c1 = ch[0];
        char c2 = ch[1];
        char c3 = ch[2];
        char c4 = ch[3];
        char c5 = ch[4];
        for (int i = 0; i < ch.length; i++) {
            char a;
            a = (char) (ch[i] + 4);
            System.out.print(a);
        }
    }
}
