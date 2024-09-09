package BSearch;

import java.util.Scanner;

public class AgressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println(cows(ar,k));

    }
        public static int cows(int []stalls, int k) {
            //    Write your code here.
            int start = 1;
            int end = stalls[stalls.length-1] - stalls[0];
            int ans = 0;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(isValid(stalls,k,mid)){
                    ans = mid;
                    start = mid+1;
                }
                end = mid - 1;
            }
            return ans;
        }
        static boolean isValid(int[] stalls,int k, int mid){
            int pos = 0;
            k--;
            for(int i = 1;i<stalls.length; i++){
                if(stalls[i] - stalls[pos] < mid)
                    continue;
                else{
                    pos = i;
                    k--;
                }
                if(k == 0) return true;
            }
            return false;
        }
    }

