package Backtracking;
import java.util.Scanner;

public class LargestNumberInKswaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        StringBuilder ans = new StringBuilder(str);
        solve(new StringBuilder(str), k, 0, ans);
        System.out.println(ans.toString());
    }
    public static void swap(StringBuilder str,int i,int j){
        char temp = str.charAt(i);
        str.setCharAt(i,str.charAt(j));
        str.setCharAt(j,temp);
    }

    public static void solve(StringBuilder str,int k,int start,StringBuilder ans){
        if(k == 0 || start == str.length() - 1){
            return;
        }
        char maxi = str.charAt(start);
        for(int i = start+1; i < str.length(); i++){
            if(str.charAt(i) >= maxi){
                maxi = str.charAt(i);
            }
        }
        for(int i = start+1; i < str.length(); i++){
            if(str.charAt(start) < str.charAt(i) && str.charAt(i) == maxi){
                swap(str,start,i);
                if(str.toString().compareTo(ans.toString()) > 0){
                    ans.setLength(0);
                    ans.append(str);
                }
                solve(str,k-1,start+1,ans);
                swap(str,start,i);
            }
        }
        solve(str,k,start+1,ans);
    }

}
