import java.util.Arrays;
import java.util.Scanner;

public class RotateByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
     //   leftRotaion(arr,n,k);
        rightRotation(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }
    static void leftRotaion(int[] arr,int n,int k){
        k = k%n;
        int[] temp = new int[k];
        for(int i=0;i<k;i++)
            temp[i] = arr[i];
        for(int i = n-k-1;i<n;i++){
            arr[i-k]  = arr[i];
        }
        for (int i = n-k;i<n;i++){
            arr[i] = temp[i-(n-k)];
        }
    }
    static void rightRotation(int[] arr,int n,int k){
        k = k%n;
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[n-k+i];
        }
        for(int i=n-1;i>=k;i--){
            arr[i] = arr[i-k];
        }
        for(int i=0;i<k;i++){
            arr[i] = temp[i];
        }
    }
}
