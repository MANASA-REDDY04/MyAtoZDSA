package stack;

import java.util.Scanner;

public class ImplementStk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        int top = -1;
        while (t-- >= 0){
            String str = sc.nextLine();
            if(str.equals("pop")){
                if(top==-1)
                    System.out.println("Empty");
                else{
                    System.out.println(arr[top]);
                    top--;
                }
            }
            else if(str.contains("push")){
                int ele = Integer.parseInt(str.substring(5));
                top++;
                arr[top] = ele;
            }
            // top -> arr[top]
            // size -> top + 1
        }
    }
}
