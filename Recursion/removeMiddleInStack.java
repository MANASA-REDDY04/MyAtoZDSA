package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class removeMiddleInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            s.push(sc.nextInt());
        }
        removeMiddle(s,n,n/2+1);
        System.out.println(s);
    }
    public static void removeMiddle(Stack<Integer> s,int n,int mid){
        if(n == 1 || n == mid){
            s.pop();
            return;
        }
        int val = s.pop();
        removeMiddle(s,n-1,mid);
        s.push(val);
    }
}
