package sortings;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        qsort(0,n-1,arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    static void qsort(int low,int high,int[] arr){
        if(low<high){
            int pindex = partition(low,high,arr);
            qsort(low,pindex-1,arr);
            qsort(pindex+1,high,arr);
        }
    }
    static int  partition(int low,int high,int[] arr){
        int pivot = arr[low];
        int i=low;
        int j = high;
        while (i<j){
            while (arr[i]<=pivot && i<=high-1){
                i++;
            }
            while (arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }
}
