package BSearch;

import java.util.Scanner;

public class SearchIn2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();
        boolean ans = searchMatrix(matrix,target);
        System.out.println(ans);
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        while (i < matrix.length && j >= 0){
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }
}
