package BSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class search2D {
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
        int target = sc.nextInt();
        System.out.println(searchMatrix(matrix,target));
    }
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        int n = mat.size();
        int m = mat.get(0).size();
        int i = 0;
        int j = m-1;
        while(i < n && j >= 0){
            if(mat.get(i).get(j) == target)
                return true;
            else if(mat.get(i).get(j) > target)
                i++;
            else
                j--;
        }
        return false;
    }
}
