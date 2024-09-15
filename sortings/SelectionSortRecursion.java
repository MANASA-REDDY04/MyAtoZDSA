package sortings;

import java.util.Scanner;

public class SelectionSortRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        sortSelection(arr,n-1,0,0);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int lsearch(int[] arr,int max){
        for(int i = 0; i < arr.length;  i++){
            if(arr[i] == max) return i;
        }
        return -1;
    }
    static void sortSelection(int[] arr, int r,int c,int max){
        if(r < 0) return;
        if(c < r){
            if(arr[c] > arr[max])
                sortSelection(arr,r,c+1,c);
            else
                sortSelection(arr,r,c+1,max);
        }
        else{
             swap(arr,max,c);
            sortSelection(arr,r-1,0,0);
        }
    }
}
