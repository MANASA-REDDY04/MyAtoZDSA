import java.util.Arrays;
import java.util.Scanner;


public class ZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        move(a,n);
        System.out.println(Arrays.toString(a));
    }

    public static void move(int[] arr,int n){
        int j=-1;
        //finding 1st zero
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
