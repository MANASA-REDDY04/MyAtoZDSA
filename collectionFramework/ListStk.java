package collectionFramework;

import java.util.Stack;

public class ListStk {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(3);
        stk.push(5);
        System.out.println(stk);

        System.out.println(stk.peek());

        stk.pop();
        System.out.println(stk);
    }
}
