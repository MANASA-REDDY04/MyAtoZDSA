package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NQueens {
    public static int[][] board;
    public static ArrayList<ArrayList<Integer>> ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        board  = new int[n][n];
        ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        helper(n,temp,0);
        System.out.println(ans);
    }
    public static void helper(int n,ArrayList<Integer> temp,int colIndex){
        // BC
        if(colIndex == n){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // checking for each row of particular colIndex
        for(int rowIndex = 0; rowIndex < n; rowIndex++){
            if(check(rowIndex,colIndex,n)){
                // some changes
                temp.add(rowIndex+1); // row -> 0 start, but ans -> 1 as start
                board[rowIndex][colIndex] = 1;

                helper(n,temp,colIndex+1);

                //backtrack
                temp.remove(temp.size()-1);
                board[rowIndex][colIndex] = 0;
            }
        }
    }

    public static boolean check(int rowIndex,int colIndex, int n){
        //check row
        for(int col = 0; col < colIndex; col++){
            if(board[rowIndex][col] == 1)
                return false;
        }
        //check diag1 top left
        int i = rowIndex;
        int j = colIndex;
        while(i>=0 && j >= 0){
            if(board[i][j] == 1)
                return false;
            i--;
            j--;
        }
        // diag2 bottom left
        i = rowIndex;
        j = colIndex;
        while(i<n && j >= 0){
            if(board[i][j] == 1)
                return false;
            i++;
            j--;
        }

        return true;

    }
}
