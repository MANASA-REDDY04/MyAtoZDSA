package Arrays;

import java.util.*;

public class DistinctEleInWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        List<Integer> li;
        li  = count(arr,n,k);
        System.out.println(li);
    }
    static List<Integer> count(int[] arr,int n,int k){
        int j=0;
        List<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> hs = new HashMap();
        for(int i=0;i<=n-k;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        li.add(hs.size());
        for(int i=k;i<n;i++){
            if(hs.get(arr[i-k]) == 1)
                hs.remove(arr[i-k]);
            else
                hs.put(arr[i-k],hs.get(arr[i-k])-1);
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        return li;
    }
}
