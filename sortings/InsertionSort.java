package sortings;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
      //  sortInsertion(n,arr);
        isort(n,arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    static void sortInsertion(int n,int[] arr){
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    static void isort(int n,int[] arr){
        for(int i=1;i<n;i++){
            int j=i-1;
            int ele = arr[i];
            while(j >= 0 && arr[j] > ele){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = ele;
        }
    }
}
