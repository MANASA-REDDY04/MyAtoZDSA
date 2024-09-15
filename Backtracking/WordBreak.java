package Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordBreak {
    public static List<String> ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        ArrayList<String> dict = new ArrayList<>();
        ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            dict.add(sc.next());
        }
        ArrayList<String> temp = new ArrayList<>();
        solve(str,dict,0,temp);
        System.out.println(ans);
    }
    public static boolean isValid(ArrayList<String> dict,String word){
        for(String x: dict){
            if(x.equals(word))
                return true;
        }
        return false;
    }
    public static void solve(String str,ArrayList<String> dict,int start,ArrayList<String> temp){
        if(start == str.length()){
            StringBuilder x = new StringBuilder();
            for(String word: temp){
                x.append(word);
                x.append(" ");
            }
            x.deleteCharAt(x.length()-1);
            ans.add(x.toString());
            System.out.println(x);

            return;
        }
        for(int i = start; i < str.length(); i++){
            if(isValid(dict,str.substring(start,i+1))){
                temp.add(str.substring(start,i+1));
                solve(str,dict,i+1,temp);
                temp.removeLast();
            }
        }
    }
}
