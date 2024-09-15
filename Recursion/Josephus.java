package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Josephus {
    static int index = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i < n; i++){
            li.add(i+1);
        }
        kill(li,k-1);
    }
    public static void kill(ArrayList<Integer> li, int k){
        if(li.size() == 1){
            System.out.println(li);
            return;
        }
        index = (index + k) % li.size();
        li.remove(index);
        kill(li,k);
    }
}
