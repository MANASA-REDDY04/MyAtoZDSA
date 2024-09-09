package BSearch;

import java.util.Arrays;
import java.util.Scanner;

public class RoseGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int r = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getMin(ar,r,b));
    }
    static int getMin(int[] arr,int r,int b){
        if(r*b > arr.length) return -1;
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        while(min <= max){
            int mid = min + (max - min)/2;
          if(isPossible(arr,mid,r,b)){
              max = mid - 1;
          }else{
              min = mid + 1;
          }
        }
        return min;
    }
    static boolean isPossible(int[] arr,int day,int r,int b){
        int n = 0;
        int count = 0;
        for (int i : arr) {
            if (i <= day) {
                count++;
            } else {
                n += count / r;
                count = 0;
            }
        }
        n += count/r;
        return n >= b;
    }
}
