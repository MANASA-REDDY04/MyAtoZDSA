package DP;

import java.util.Scanner;

public class Knapsack0by1 {

    static int[][] t = new int[10][10];
    public static int knapsack(int[] wt, int[] val, int W, int n){
        if(n==0 || W== 0)
            return 0;
        if(t[n][W] != -1)
            return t[n][W];
        else if(wt[n-1] <= W){
            return t[n][W] = Math.max(val[n-1]+knapsack(wt,val,W-wt[n-1],n-1),knapsack(wt,val,W,n-1));
        }
        else{
            return t[n][W] = knapsack(wt,val,W,n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
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
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < W+1; j++){
                t[i][j] = -1;
            }
        }
        System.out.println(knapsack(wt,val,W,n));
    }
}
