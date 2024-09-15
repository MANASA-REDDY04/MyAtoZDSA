package Recursion;

import java.util.Scanner;

public class NthBitBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(0,0,n,"");
    }
    public static void printNumbers(int ones,int zeros,int n,String op){
        if(n == 0){
            System.out.println(op);
            return;
        }
        printNumbers(ones+1,zeros,n-1,op+'1');
            if(ones > zeros){
                printNumbers(ones,zeros+1,n-1,op+'0');
            }
    }
}
