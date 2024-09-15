package sortings;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            sortBubble(n,arr);
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");
        }
        static void sortBubble(int n,int[] arr){
            for(int i=n-1;i>=1;i--){
                int didswap=0;
                for(int j=0;j<=i-1;j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        didswap = 1;
                    }
                }
                // if no swaps will be happend in ith iteration, so all the elements are sorted.
                if(didswap==0)
                    break;
            }
        }

}
