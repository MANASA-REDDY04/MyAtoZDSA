package Arrays;

import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            long sum = 0;
            long maxSum = Integer.MIN_VALUE;
            int start = -1;
            int end = -1;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum > maxSum) {
                    maxSum = sum;
                    end = i;
                }
                if (sum == 0) {
                    start = i;
                    end = i;
                }
                if (sum < 0) {
                    sum = 0;
                }
            }
            System.out.println(maxSum + " " + start + " " + end);
        }
    }
}
