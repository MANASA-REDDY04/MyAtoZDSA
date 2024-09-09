package BSearch;

import java.util.Scanner;

public class ShipCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println( leastWeightCapacity(ar,d));
    }
    public static int leastWeightCapacity(int[] weights, int d) {
        // Write your code here.
        int low = 0;
        int high = 0;
        for(int i: weights){
            if(i > low) low = i;
            high += i;
        }
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isValid(weights,mid,d)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] weights,int mid,int d){
        int count = 0;
        int sum = 0;
        for(int i: weights){
            sum += i;
            if(sum > mid){
                sum = i;
                count++;
            }
            if(count > d) return false;
        }
        if(count + 1 > d) return false;
        return true;
    }
}
