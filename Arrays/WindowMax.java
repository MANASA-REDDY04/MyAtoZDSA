package Arrays;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class WindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int sum = maxSum(arr,n,k);
            System.out.println(sum);
        }
    }
    static int maxSum(int[] arr,int n,int k){
        int sum = 0;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst() == i-k){
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i >= k-1){
                sum += arr[dq.peekFirst()];
            }
        }
        return sum;
    }
}
