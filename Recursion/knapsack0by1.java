package Recursion;

import java.util.Scanner;

public class knapsack0by1 {
    public static int knapsack(int[] wt,int[] val, int W,int n){
        if(W == 0 || n==0)
            return 0;
        if(wt[n-1] <= W){
            return Math.max(val[n-1]+knapsack(wt, val, W-wt[n-1], n-1),knapsack(wt, val, W, n-1));
        }
        else
            return knapsack(wt, val, W, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter W:");
        int W = sc.nextInt();

        int[] wt = new int[n];
        int[] val = new int[n];

        for(int i = 0; i<n; i++){
            wt[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++){
            val[i] = sc.nextInt();
        }
        System.out.println(knapsack(wt,val,W,n));
    }
}
