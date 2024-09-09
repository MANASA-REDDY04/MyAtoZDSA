package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class LeadersArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void replaceElements(int[] arr){
        int n = arr.length;
        List li = new ArrayList<>();
        int max = arr[n-1];
        li.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i] > max){
                li.add(arr[i]);
                max = arr[i];
            }
        }
        for(int i=0;i<n-1;i++){
            int ele=-1;
            if(!li.isEmpty()){
                ele = (int) li.getLast();
            }
            if(arr[i] != ele){
                arr[i] = ele;
            }else{
                li.removeLast();
                arr[i] = (int)li.getLast();
            }
        }
        arr[n-1] = -1;
    }
}
