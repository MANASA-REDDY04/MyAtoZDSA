import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Intersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for(int i=0;i<n1;i++)
            a[i] = sc.nextInt();
        for (int i = 0;i<n2;i++)
            b[i] = sc.nextInt();
        List<Integer> ls = new ArrayList<>();
        int i=0,j=0;
        while(i<n1 && j<n2){
            if(a[i] == b[j]){
                ls.add(a[i]);
                i++;j++;
            }
            else if(a[i] < b[j])
                i++;
            else
                j++;
        }
        System.out.println(ls);
    }
}
