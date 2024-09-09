import java.io.*;
import java.util.*;

public class countfreq{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }
            else
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int k=sc.nextInt();
            if(hm.containsKey(k))
            {
                System.out.println(hm.get(k));
            }
            else
            {
                System.out.println(0);
            }
}}
}