package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i < n; i++){
            li.add(sc.nextInt());
        }
        sort(li);
        System.out.println(li);
    }
    public static void sort(ArrayList<Integer> li){
        if(li.size() == 1)
            return;
        int temp = li.getLast();
        li.removeLast();
        sort(li);
        insert(li,temp);
        return;
    }
    public static void insert(ArrayList<Integer> li,int temp){
        if(li.isEmpty() || li.getLast() <= temp) {
            li.add(temp);
            return;
        }
        int val = li.getLast();
        li.removeLast();
        insert(li,temp);
        li.add(val);
        return;
    }
}
