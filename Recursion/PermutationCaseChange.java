package Recursion;

import java.util.Scanner;

public class PermutationCaseChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        printCases(ip,"");
    }
    public static void printCases(String ip,String op){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }
        if(ip.charAt(0) >= '0' && ip.charAt(0) <= '9'){
            printCases(ip.substring(1),op+ip.charAt(0));
        }
        else {
            String op1 = op + ip.charAt(0);
            String op2 = op + (char) (ip.charAt(0));
            printCases(ip.substring(1), op1);
            printCases(ip.substring(1), op2);
        }
    }
}
