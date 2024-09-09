package BSearch;

import java.util.Scanner;

public class nextLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] ar = new char[n];
        for(int i = 0; i < n; i++){
            ar[i] = sc.next().charAt(0);
        }
        System.out.println("key:");
        char key = sc.next().charAt(0);
        System.out.println(getIndex(ar,key));
    }
    static char getIndex(char[] ar,char key){
        int start = 0;
        int end = ar.length-1;
        if(ar[end] == key) return '-';
        while (start <= end){
            int mid = start + (end - start)/2;
            if(ar[mid] == key)
                return ar[mid+1];
            else if(ar[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return '-';
    }
}
