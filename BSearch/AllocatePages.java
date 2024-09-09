package BSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AllocatePages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ar.add(sc.nextInt());
        }
        int k = sc.nextInt();
        System.out.println(getMinOfMax(ar,n,k));
    }
    static int getMinOfMax(ArrayList<Integer> ar,int n,int k){
        if(n < k)
            return -1;
        int start = Collections.max(ar);
        int end = 0;
        int res = -1;
        for(int i : ar)
            end += i;
        while(start <= end){
            int mid = (start + end)/2;
            if(isValid(ar,n,k,mid)){
                res = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return res;
    }
    static boolean isValid(ArrayList<Integer> ar,int n, int k, int mx){
        int student = 1;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += ar.get(i);
            if(sum > mx){
                student++;
                sum = ar.get(i);
            }
            if(student > k)
                return false;
        }
        return true;
    }
}
