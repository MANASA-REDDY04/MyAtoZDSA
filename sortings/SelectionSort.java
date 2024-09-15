package sortings;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        sortselection(n,arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    static void sortselection(int n,int[] arr){
        int min;
        // no of iterations to sort : 0 -- n-2 (last element will be sorted)
        for(int i=0;i<=n-2;i++){
            min = i;
            // to check minimum element in unsorted array
            for(int j=i+1;j<=n-1;j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            if(min!=i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
