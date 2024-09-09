package BSearch;

import java.util.Scanner;

public class SearchBitonicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int maxIndex = findPeak(ar);
        System.out.println(ar[maxIndex]);
        int ans = bsAsc(ar,0,maxIndex-1,k);
        System.out.println(ans);
        if(ans == -1)
           ans = bsDec(ar,maxIndex,n-1,k);
        System.out.println(ans);
    }
    static int findPeak(int[] ar){
        int low = 1;
        int high = ar.length - 2;
        if(ar[0] > ar[1])
            return ar[0];
        else if(ar[high + 1] > ar[high])
            return ar[high+1];
        while (low <= high){
            int mid = low + (high - low)/2;
            if(ar[mid] > ar[mid - 1] && ar[mid] > ar[mid + 1])
                return mid;
            else if(ar[mid] > ar[mid-1])
                low = mid+1;
            else
                high = mid - 1;
        }
        return -1;
    }
    static int bsAsc(int[] ar,int low,int high,int key){
        while (low <= high){
            int mid = low + (high - low)/2;
            if(ar[mid] == key)
                return mid;
            else if(ar[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    static int bsDec(int[] ar,int low,int high,int key){
        while (low <= high){
            int mid = low + (high - low)/2;
            if(ar[mid] == key)
                return mid;
            else if(ar[mid] < key)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
