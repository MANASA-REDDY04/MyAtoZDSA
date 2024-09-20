package OOP;

public class varAgrs {
    public static int sum(int x,int ...arr){
        int result = 0;
        for(int ele:arr)
            result += ele;
        return result;
    }
    public static void main(String[] args) {
        System.out.println("sum of "+sum(4,5,8));
        System.out.println("sum of "+sum(4,6,7,9));
        System.out.println("sum of "+sum(3));
    }
}
