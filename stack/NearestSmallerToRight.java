package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NearestSmallerToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nearestSmallElementToRight(arr, n)));
    }
    public static int[] nearestSmallElementToRight(int[] arr,int n)
    {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--)
        {
            if(st.isEmpty())
                ans[i] = -1;
            else
            {
                while (!st.isEmpty() && st.peek() >= arr[i])
                    st.pop();
                ans[i] = (!st.isEmpty()) ? st.peek() : -1;
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
