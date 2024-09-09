package BSearch;

import java.util.Scanner;

public class MinimizeTheMaxProduct{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        int[] quantities = new int[len];
        for(int i = 0; i < len; i++){
            quantities[i] = sc.nextInt();
        }
        System.out.println(getMaxOfMin(quantities,n));
    }
    static int getMaxOfMin(int[] quantities,int n){
        int start = 0;
        int end = 0;
        int res = -1;
        for(int i : quantities)
            end += i;
        while (start <= end){
            int mid = (start + end)/2;
            if(isValid(quantities,n,mid)){
                res = mid;
                end = mid - 1;
            }
            else
                start = mid + 1;
        }
        return res;
    }
    static boolean isValid(int[] quantities,int n,int mx){
        int sum;
        int store = 0;
        int quan = 0;
        for(int i = 0; i < quantities.length; i++){
            sum = 0;
            quan = quantities[i];
            while (quan >= mx){
                sum += mx;
                store++;
                quan -= mx;
            }
            if(quan > 0){
                store++;
            }
            if(store > n)
                return false;
        }
        return true;
    }
}
