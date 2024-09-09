package BSearch;

import java.util.Scanner;

public class KthPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println(missingK(ar,n,k));
    }
    public static int missingK(int[] vec, int n, int k) {
        // Write your code here.
        int low = 0;
        int high = n-1;
        int missing = 0;
        if(k < vec[0]) return k;
        while(low <= high){
            int mid = low + (high - low)/2;
            missing = vec[mid] - mid - 1;
            if(missing < k)
                low = mid + 1;
            else
                high = mid - 1;
        }
        missing = vec[high] - high - 1;
        int more = vec[high] - missing;
        return k + more;
    }
}
