package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        subsets(ip,"");
    }
    public static void subsets(String  ip,String op){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }
        subsets(ip.substring(1),op);
        subsets(ip.substring(1),op+ip.charAt(0));

    }
}
