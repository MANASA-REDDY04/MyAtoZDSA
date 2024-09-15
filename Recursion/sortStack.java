package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class sortStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            s.push(sc.nextInt());
        }
        sort(s);
        System.out.println(s);
    }
    public static void sort(Stack<Integer> s){
        if(s.size() == 1)
            return;
        int temp = s.pop();
        sort(s);
        insert(s,temp);
    }
    public static void insert(Stack<Integer> s, int temp){
        if(s.isEmpty() || s.peek() <= temp) {
            s.push(temp);
            return;
        }
        int val = s.pop();
        insert(s,temp);
        s.push(val);
    }
}
