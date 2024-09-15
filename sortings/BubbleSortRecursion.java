package sortings;

import java.util.Scanner;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        sortBubble(arr,n-1,0);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortBubble(int[] arr,int r,int c){
        if(r == 0)
            return;
        else if(c < r){
            if(arr[c] > arr[c+1]){
                swap(arr,c,c+1);
            }
            sortBubble(arr,r,c+1);
        }
        else{
            sortBubble(arr,r-1,0);
        }
    }
}
