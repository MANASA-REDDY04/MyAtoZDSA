package Arrays;

import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x = 4;
            int ans = x / 4;
            x = x - x / 4;
            if (x >= 2)
                ans += 1;
            System.out.println(ans);
    }
}
