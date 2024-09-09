package BSearch;

import java.util.Scanner;

public class NearlySortedBs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();
        System.out.println(getIndex(ar,k));
    }
    static int getIndex(int[] ar,int k){
        int start = 0;
        int end = ar.length - 1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(ar[mid] == k)
                return mid;
            else if(mid - 1 >= start && ar[mid - 1] == k)
                return mid-1;
            else if(mid + 1 <= end && ar[mid + 1] == k)
                return mid+1;
            else if(ar[mid] < k)
                start = mid + 2;
            else
                end = mid - 2;
        }
        return -1;
    }
}
