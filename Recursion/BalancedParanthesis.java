package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class BalancedParanthesis {
    public static ArrayList<String> li = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generate(n,n,"");
//        System.out.println(li);
    }
    public static void generate(int open,int close,String op){
       if(open == 0 && close == 0){
           System.out.println(op);
           return;
       }
       if(open != 0)
           generate(open-1,close,op+'(');
       if(close > open)
           generate(open,close-1,op+')');
       }
}
