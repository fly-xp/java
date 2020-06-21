package LanQiaoBei;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        DecimalFormat fm = new DecimalFormat("0.0000000");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double S = r * r * Math.PI;
        System.out.println(fm.format(S));
    }
}
