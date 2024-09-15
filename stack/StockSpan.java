package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

// count of consecutive <= elements before arr[i]
public class StockSpan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nearestGreaterToLeft(arr, n)));
    }
    public static int[] nearestGreaterToLeft(int[] arr,int n)
    {
        int[] indices = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i <= n-1; i++)
        {
            if(st.isEmpty())
                indices[i] = -1;
            else
            {
                while(!st.isEmpty() && arr[st.peek()] < arr[i])
                    st.pop();
                if(!st.isEmpty()){
                    indices[i] = st.peek();
                }
                else{
                    indices[i] = -1;
                }
            }
            st.push(i);
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = i-indices[i];
        }
        return ans;
    }
}
