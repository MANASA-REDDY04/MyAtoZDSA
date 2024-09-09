import java.util.ArrayList;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            list.add(ele);
        }
        int k = sc.nextInt();
        k = k%n;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<k;i++){
            temp.add(list.get(i));
        }
        System.out.println(temp);
        for(int i=k;i<n;i++){
            list.set(i-k,list.get(i));
        }
        for(int i=n-k;i<n;i++){
            list.set(i,temp.get(i-(n-k)));
       }
        System.out.println(list);
    }
}
