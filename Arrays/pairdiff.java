package Arrays;

import java.io.*;
import java.util.*;

    public class pairdiff {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-- > 0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = new int[n];
                boolean ans = diff(n,k,arr);
                System.out.println(ans);
            }
        }
        static boolean diff(int n,int k,int[] arr){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++)
                    if(arr[i] - arr[j] == k || arr[j] - arr[i] == k)
                        return true;
            }
            return false;
        }
    }

