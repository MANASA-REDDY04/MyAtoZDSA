package Recursion;

import java.util.Scanner;

public class PermutationWithSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        printSubsets(ip.substring(1),ip.substring(0,1));
    }
    public static void printSubsets(String ip,String op){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }
        printSubsets(ip.substring(1),op+"_"+ip.charAt(0));
        printSubsets(ip.substring(1),op+ip.charAt(0));
    }
}
