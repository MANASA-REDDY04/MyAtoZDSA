package collectionFramework;

import java.util.*;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
set
    ->hashset
    ->treeset
    ->LinkedHashset
 */
public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();      //stores values randomly, based on hashkey  O(1)
      //LinkedHashSet<Integer> hs = new LinkedHashSet<>(); //stores values in the form of given input
      // TreeSet<Integer> hs = new TreeSet<>();  //stores values in sorted order (implements BST) -> O(logn)
        hs.add(54);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(23);
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println(hs);
        /*
        remove(val) , contains(val), isEmpty(), size(), clear()
         */
        
    }
}
