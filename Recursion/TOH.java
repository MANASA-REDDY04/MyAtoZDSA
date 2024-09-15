package Recursion;

import java.util.Scanner;

public class TOH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n,1,3,2);
    }
    public static void toh(int n,int s,int d,int h){
        if(n == 1){
            System.out.println(s+"->"+d);
            return;
        }
        toh(n-1,s,h,d);
        System.out.println(s+"->"+h);
        toh(n-1,h,d,s);
        System.out.println(h+"->"+d);
    }
}
