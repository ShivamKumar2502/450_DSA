import java.util.*;
import java.lang.*;
import java.io.*;

class MoveAllNegativeToEnd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int) (n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }

            Solution obj = new Solution();
            obj.segregateElements(a, n);

            for (int i = 0; i < n; i++)
                System.out.print(a[i] + " ");

            System.out.println();
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {

    public void segregateElements(int arr[], int n) {
        // Your code goes here
        int temp1 = 0, temp2 = 0, count1 = 0, count2 = 0, count3 = 0;
        int arr2[] = new int[n];
        int arr3[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr2[count1++] = arr[i];
                temp1++;
            } else {
                arr3[count2++] = arr[i];
                temp2++;
            }
        }

        for (int i = 0; i < temp1; i++) {
            arr[i] = arr2[i];
        }

        for (int i = temp1; i < n; i++) {
            arr[i] = arr3[count3];
            count3++;
        }

    }
}