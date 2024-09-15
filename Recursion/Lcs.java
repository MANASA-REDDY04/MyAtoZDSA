package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Lcs {
    static int[][] t = new int[10][10];
    public static int longestSubsequenceLength(char[] x,char[] y, int n,int m){

        if(n==0 || m== 0)
            return 0;
        if(t[n][m] != -1)
            return t[n][m];

        if(x[n-1] == y[m-1])
            return t[n][m] = 1+longestSubsequenceLength(x,y,n-1,m-1);
        else
            return t[n][m] =  Math.max(longestSubsequenceLength(x,y,n,m-1),longestSubsequenceLength(x,y,n-1,m));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] x = new char[n];
        for(int i = 0; i < n; i++){
            x[i] = sc.next().charAt(0);
        }
        int m = sc.nextInt();
        char[] y = new char[m];
        for(int i = 0; i < m; i++){
            y[i] = sc.next().charAt(0);
        }
        for(int[] row: t){
            Arrays.fill(row,-1);
        }
        System.out.println(longestSubsequenceLength(x,y,n,m));
    }
}
