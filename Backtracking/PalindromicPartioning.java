package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class PalindromicPartioning {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<ArrayList<String>> ans; ans = new ArrayList<>();
        StringBuilder s = new StringBuilder(str);
        ArrayList<String> li = new ArrayList<>();
        solve(s,li,0,ans);
        System.out.println(ans);
    }
    public static boolean isPalin(StringBuilder ps){
        int s=0;
        int e = ps.length()-1;
        while(s<e){
            if(ps.charAt(s)!=ps.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void solve(StringBuilder s,ArrayList<String> li, int start,ArrayList<ArrayList<String>> ans){
        if(start == s.length()){
            ans.add(new ArrayList<>(li));
            return;
        }
        StringBuilder ps = new StringBuilder();
        for(int i = start; i < s.length(); i++){
            ps.append(s.charAt(i));
            if(isPalin(ps)){
                li.add(ps.toString());
                solve(s,li,i+1,ans);
                li.removeLast();
            }
        }
    }
}
