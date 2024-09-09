package BSearch;

import java.util.Scanner;

public class LargestSubarrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println(largestSubarraySumMinimized(ar,k));
    }
    public static int largestSubarraySumMinimized(int []a, int k) {
        // Write Your Code Here
        int start = 0;
        int end = 0;
        int ans = 0;
        for(int i : a){
            if(start < i) start = i;
            end += i;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isValid(a,mid,k)){
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return end;
    }
    static boolean isValid(int[] a,int mid,int k){
        int count = 1;
        int sum = 0;
        for(int i : a){
            sum += i;
            if(sum > mid){
                count++;
                sum = i;
            }
            if(count > k)
                return false;
        }
        return count==k;
    }
}
