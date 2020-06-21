package LanQiaoBei;

public class quickSort {
    public static void main(String[] args) {
        int[] n = {52, 54, 12, 5, 4, 6};
        quick(0, 5, n);
        for (int i = 0; i < n.length; i++)

        {
            System.out.println(n[i]);

        }
    }

    public static void quick(int left, int right, int n[]) {
        int i = left;
        int j = right;
        int temp = n[left];
        if (left > right) {
            return;
        }
        while (i != j) {
            while (i < j && n[j] > temp) {
                j--;
            }
            if (j > i) {
                n[i] = n[j];
            }
            while (i < j && n[i] <= temp) {
                i++;
            }
            if (j > i) {
                n[j] = n[i];
            }
            n[i] = temp;
            quick(left, i - 1, n);
            quick(i + 1, right, n);
        }


    }
}
