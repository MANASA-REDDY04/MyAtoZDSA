import java.util.Scanner;

public class SortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        boolean ans = check(arr);
        System.out.println(ans);
    }
    static boolean check(int[] nums) {
        int n = nums.length;
        int x = 1;
        for(int i=1;i<n;i++){
            if(nums[i-1] < nums[i])
                x++;
            else
                break;
        }
        while(x<n-1){
            if(nums[x]>nums[x+1])
                return false;
            x++;
        }
        if(nums[x] <= nums[0])
        return true;
        else
            return false;
    }
}
