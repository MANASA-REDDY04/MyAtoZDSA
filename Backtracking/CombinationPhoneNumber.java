package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CombinationPhoneNumber {
    public static HashMap<Character,String> hm = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder temp = new StringBuilder();
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
        solve(s,temp,0);
    }
    public static void solve(String digits,StringBuilder temp,int idx){
        if(idx == digits.length()){
            System.out.println(temp);
            return;
        }
        char ch = digits.charAt(idx);
        String val = hm.get(ch);
        for(int i = 0; i < val.length(); i++){
            temp.append(val.charAt(i));
            solve(digits, temp, idx+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
