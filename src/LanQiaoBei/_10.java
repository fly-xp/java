package LanQiaoBei;

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {
        // long sum=0;
        int temp = 0;
        int count = 0;
        int count1 = 0;
        Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        int[] arrs = new int[100];
        for (int i = 0; i < 100; i++) {
            arrs[i] = sc.nextInt();
        }
        sc.close();
       /* //max=arrs[0];
       // min=arrs[0];
        for (int i = 0; i <arrs.length ; i++) {
            if(arrs[i]>max){
                max=arrs[i];
            }
            if(arrs[i]<min) {
                min=arrs[i];
            }
        }
        for (int i = 0; i <arrs.length ; i++) {
            sum+=arrs[i];

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);*/
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] > arrs[i + 1]) {
                count++;
            }
            if (count > 1) {
                temp = arrs[arrs.length - 1];
                arrs[arrs.length - 1] = arrs[i + 1];
                arrs[i + 1] = arrs[i + 2];
                count1++;
            }
            if (count == 1) {
                arrs[arrs.length - 1] = arrs[i];
                count1++;
            }
        }
        System.out.println(count1);
    }

}
