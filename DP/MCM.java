package DP;
import java.util.Arrays;
import java.util.Scanner;

public class MCM {
    static int[][] t;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        System.out.println(maxCoins(nums));
    }
    public static int maxCoins(int[] nums) {
        t = new int[nums.length][nums.length];
        for(int[] row: t){
            Arrays.fill(row,-1);
        }
        return solve(nums,0,nums.length-1);
    }
    public static int solve(int[] arr,int i, int j){
        if(i>j) return 0;
        if(t[i][j] != -1)
            return t[i][j];
        int max = 0;
        for(int k = i; k <= j; k++){
            int temp = solve(arr,i,k-1) + solve(arr,k+1,j) + arr[k] * (i-1 < 0? 1:arr[i-1]) * (j+1 >= arr.length?1:arr[j+1]);
            max = Math.max(max,temp);
        }
        return t[i][j] = max;
    }
}
