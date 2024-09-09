package BSearch;

import java.util.Scanner;

public class MedianIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = sc.nextInt();
        System.out.println(findMedian(matrix,n,m));
    }
    public static int findMedian(int matrix[][], int m, int n) {
        // Write your code here
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0; i < m; i++){
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n-1]);
        }
        int req = (n*m)/2;
        while(low <= high){
            int mid = low + (high - low)/2;
            int smallerEquals = 0;
            for(int i = 0; i < m; i++){
                smallerEquals += blackBox(matrix[i],mid);
            }
            if(smallerEquals <= req)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
    static int blackBox(int[] matrix,int x){
        int count = 0;
        int low = 0;
        int high = matrix.length;
        while(low <= high){
            int mid = (low + high)/2;
            if(matrix[mid] > x){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        count += low;
        return count;
    }
}
