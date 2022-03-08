import java.io.*;
import java.util.*;

class Kth_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            int k = sc.nextInt();
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, 0, n - 1, k));
        }
        out.flush();
    }
}

class Solution {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        // Your code here
        Arrays.sort(arr);
        // l = arr[0];
        // r = arr[n-1];
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((k - 1) == i) {
                num = arr[i];
            }
        }

        return num;

    }
}
