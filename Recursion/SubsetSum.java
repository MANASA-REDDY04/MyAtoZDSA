package Recursion;

import java.util.Scanner;
// Not woking for all test cases, coded it as practice for Subsetsum using DP -> iterative
public class SubsetSum {
    public static boolean getSubsetSum(int[] arr,int n, int k){
        if(n==0)
            return false;
        if(k==0)
            return true;
        else if(arr[n-1] <= k){
            return getSubsetSum(arr,n-1,k-arr[n-1]) || getSubsetSum(arr,n-1,k);
        }
        else{
            return getSubsetSum(arr,n-1,k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(getSubsetSum(arr,n,k));
    }
}
