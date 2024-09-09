package BSearch;

import java.util.Scanner;

public class MinDifferenceElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        System.out.println(getEle(ar,key));
    }
    static int getEle(int[] ar,int k){
        int low = 0;
        int high = ar.length;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(ar[mid] == k)
                return ar[mid];
            else if(ar[mid] < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if(Math.abs(ar[low] - k) < Math.abs(ar[high] - k))
            return ar[low];
        return ar[high];
    }
}
