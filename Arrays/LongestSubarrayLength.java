package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int count = find(arr,n,k);
        System.out.println(count);
    }
    static int find(int[] arr,int n,int k){
        int count = 0;
        int sum=0;
        int len = 0;
        HashMap<Integer,Integer> hm =  new HashMap<>();
        for (int i=0;i<n;i++){
            sum += arr[i];
            if(sum == k) {
                len = i + 1;
                count++;
            }
            //takes care of zeros
            if(!hm.containsKey(sum))
             hm.put(sum,i);
            if(hm.containsKey(sum-k)){
                len = Math.max(len,i-hm.get(sum-k));
                count++;
            }
        }
        return count;
    }
}
