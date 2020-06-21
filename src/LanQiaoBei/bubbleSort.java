package LanQiaoBei;

public class bubbleSort {
    public static void main(String[] args) {
        int[] n = {49, 38, 86, 65, 24, 97, 13, 26, 49};
        int temp = 0;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
        for (int i : n
                ) {
            System.out.print(i + " ");
        }

    }
}
