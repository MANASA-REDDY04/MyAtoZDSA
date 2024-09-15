package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CollectionArrClass {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<10;i++)
            arr[i] = i+10;

        int index = Arrays.binarySearch(arr,3);
        System.out.println(Arrays.toString(arr));
        System.out.println(index);
        arr[0] = 99;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,99);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> li = new ArrayList<>();
        li.add(0);
        li.add(11);
        li.add(12);
        li.add(11);
        System.out.println(li);
        System.out.println(Collections.max(li));
        System.out.println(Collections.min(li));
        System.out.println(Collections.frequency(li,11));
        Collections.sort(li);
        System.out.println(li);
        Collections.sort(li, Comparator.reverseOrder());
        System.out.println(li);
    }
}
