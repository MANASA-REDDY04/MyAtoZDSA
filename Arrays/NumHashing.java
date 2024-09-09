import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int freq = 0;
            if (mp.containsKey(arr[i]))
                freq = mp.get(arr[i]); // fetching from the map
            freq++;
            mp.put(arr[i], freq); // inserting into the map
        }
        System.out.println(mp);


    }
}
