package Arrays;

import java.io.*;
import java.util.*;

public class RepeatedNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int axor = 0;
            int ixor = 0;
            for (int i = 0; i < n; i++) {
                axor ^= a[i];
                if (i <= n - 2) {
                    ixor ^= i;
                }
            }
            int txor = axor ^ ixor;
            int pos = getPos(txor);
            int set = 0;
            int unset = 0;
            pos = (1 << pos);
            for (int i = 0; i < n; i++) {
                if ((pos & a[i]) != 0) {
                    set ^= a[i];
                } else {
                    unset ^= a[i];
                }
                if(i <= n-2) {
                    if ((pos & i) != 0) {
                        set ^= i;
                    } else {
                        unset ^= i;
                    }
                }
            }
            System.out.println(set + " " + unset);
        }
    }

    static int getPos(int txor) {
        int pos = 0;
        int x = 1;
        while (txor != 0) {
            if ((x & txor) != 0) {
                return pos;
            }
            pos++;
            x = x << 1;
        }
        return pos;
    }
}