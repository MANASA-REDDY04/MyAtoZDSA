import java.util.ArrayList;
import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            list.add(ele);
        }
        int i=0;
        for(int j=1;j<n;j++){
            if(list.get(i) != list.get(j)){
                list.set(i+1,list.get(j));
                i++;
            }
        }
        System.out.println(i+1);
    }
}
