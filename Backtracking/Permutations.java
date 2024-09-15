package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<String> ans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        permutations(s.toCharArray(),0,ans);
        System.out.println(ans);
    }
    public static void swap(char[] ip, int i,int j){
        char temp = ip[i];
        ip[i] = ip[j];
        ip[j] = temp;
    }
    public static void permutations(char[] ip,int start,ArrayList<String> ans){
        if(start == ip.length-1){
            ans.add(Arrays.toString(ip));
            return;
        }
        HashSet<Character> hs = new HashSet<>();
        for(int i = start; i < ip.length; i++){
            if(!hs.contains(ip[i])){
                hs.add(ip[i]);
                swap(ip,start,i);
                permutations(ip,start+1,ans);
                swap(ip,start,i);
            }
        }
    }
}
