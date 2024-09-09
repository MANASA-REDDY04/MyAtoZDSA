package BSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class maxOnesRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ArrayList<Integer> li = new ArrayList<>();
            for(int j = 0; j < m; j++){
                int ele = sc.nextInt();
                li.add(ele);
            }
            matrix.add(li);
        }
       System.out.println(maximumOnesRow(matrix,n,m));
    }
    static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int maxRow = -1;
        int maxIndex = -1;
        for(int i = 0; i < n; i++){
            int count = 0;
            int ans = bs(matrix.get(i),m);
            if(ans > maxRow){
                maxRow = ans;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    static int bs(ArrayList<Integer> list,int m){
        int ans = -1;
        int low = 0;
        int high = m-1;
        int count = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(list.get(mid) >= 1){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        count = m - ans;
        return ans == -1 ? -1: count;
    }
}
