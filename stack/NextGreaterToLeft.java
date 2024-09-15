package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nearestLargeElementsToLeft(arr, n)));
    }
    public static int[] nearestLargeElementsToLeft(int[] arr,int n)
    {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i <= n-1; i++){
            if(st.isEmpty())
                ans[i] = -1;
            else {
                while (!st.isEmpty() && st.peek() <= arr[i])
                    st.pop();
                if(!st.isEmpty())
                    ans[i] = st.peek();
                else
                    ans[i] = -1;
            }
            st.push(arr[i]);
        }

        return ans;
    }
}
