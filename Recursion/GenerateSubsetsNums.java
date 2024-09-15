package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateSubsetsNums {
    public static List<List<Integer>> ans = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> ip = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ip.add(sc.nextInt());
        }
        List<Integer> op = new ArrayList<>();
        printSubsets(ip,op);
        for(List<Integer> x: ans){
            System.out.println(x);
        }
    }
    public static void printSubsets(List<Integer> ip,List<Integer> op){
        if(ip.isEmpty()){
            ans.add(new ArrayList<>(op));
            return;
        }
        int num = ip.get(0);
        ip.remove(0);
        printSubsets(ip,op);
        List<Integer> op2 = new ArrayList<>(op);
        op2.add(num);
        printSubsets(ip,op2);
        ip.add(0,num);
    }
}
