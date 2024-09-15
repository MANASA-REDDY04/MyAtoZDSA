package stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largestRectangleArea(arr));
    }
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        if(heights.length == 1)
            return heights[0];
        else if(heights.length == 2)
            return Math.max(heights[0],heights[1]);

        int n = heights.length;
        // nearest smallest to left
        int[] lsarr = leftSmallest(heights,n);
        int[] rsarr = rightSmallest(heights,n);
        System.out.println(Arrays.toString(lsarr));
        System.out.println(Arrays.toString(rsarr));
        for(int i = 0; i < n-1; i++){
           int width = rsarr[i] - lsarr[i] - 1;
           int area = width*heights[i];
            System.out.print(area+" ");
           maxArea = Math.max(maxArea,area);
        }
        System.out.println();
        return maxArea;
    }
    public static int[] leftSmallest(int[] arr,int n)
    {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i <= n-1; i++){
            if(st.isEmpty()) ans[i] = n;
            else {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                    st.pop();
                ans[i] = (!st.isEmpty()) ? st.peek() :  -1;
            }
            st.push(i);
        }
        return ans;
    }

    public static int[] rightSmallest(int[] arr,int n)
    {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            if(st.isEmpty()) ans[i] = n;
            else {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                    st.pop();
                ans[i] = (!st.isEmpty()) ? st.peek() : n;
            }
            st.push(i);
        }
        return ans;
    }
}
