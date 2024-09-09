package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Merge2sortedarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for(int i=0;i<n1;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<n2;i++)
            b[i] = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        list = sortedArray(a,b);
        System.out.println(list);
    }
    public static List< Integer > sortedArray(int []a, int []b) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        int n1 = a.length;
        int n2 = b.length;
        while(i < n1 && j < n2){
            if(a[i] <= b[j]){
                if(list.isEmpty() || list.getLast() != a[i])
                    list.add(a[i]);
                i++;
            }else{
                if(list.isEmpty() || list.getLast() != b[j])
                    list.add(b[j]);
                j++;
            }
        }
        while (i<n1){
            if(list.getLast() != a[i])
                list.add(a[i]);
            i++;
        }
        while (j<n2){
            if(list.getLast() != b[j])
                list.add(b[j]);
            j++;
        }
        return list;
    }
}
