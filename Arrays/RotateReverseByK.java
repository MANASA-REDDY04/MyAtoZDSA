package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateReverseByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        leftRotaion(arr,n,k);
       // rightRotation(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr,int s,int e){
        while(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;e--;
        }
    }
    static void leftRotaion(int[] arr,int n,int k){
        k = k%n;
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        rev(arr,0,n-1);
    }
    static void rightRotation(int[] arr,int n,int k){
        k = k%n;
        rev(arr,0,n-k-1);
        rev(arr,n-k,n-1);
        rev(arr,0,n-1);
    }
}
