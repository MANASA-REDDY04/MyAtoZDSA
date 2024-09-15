package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class NDigitsWithIncreasingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        solve(n,0,temp,ans);
        System.out.println(ans);
    }
    public static void solve(int n, int start,ArrayList<Integer> temp,ArrayList<Integer> ans){
        if(n == 0){
            int x = 0;
            for(int i = 0; i < temp.size(); i++){
                x = x*10 + temp.get(i);
            }
            ans.add(x);
            return;
        }
        //digits
        for(int i = start+1; i <= 9; i++){
            temp.add(i);
            solve(n-1,start+1,temp,ans);
            temp.removeLast();
        }
    }
}
