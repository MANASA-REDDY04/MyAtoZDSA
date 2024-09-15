package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* List
    ->ArrayList
    ->LinkedList
    ->Stack
 */
public class ListArrLl {
    public static void main(String[] args) {

        ArrayList<Integer> li = new ArrayList<>();
     // LinkedList<Integer> li  = new LinkedList<>();

        // all the methods of List can be implemented for both arraylist and linkedlist

        li.add(1);
        li.add(2);
        li.add(4);

        li.add(2,3);
        System.out.println(li);

        li.set(3,50);

        for (int i=0;i<li.size();i++)
            System.out.println(li.get(i));

        li.remove(2);

        Iterator<Integer> it = li.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        boolean ans = li.contains(50);
        System.out.println(ans);

        ArrayList<Integer> li2 = new ArrayList<>();
        li2.add(100);
        li2.add(120);

        li.addAll(li2);
        System.out.println(li);

        li.clear();
        System.out.println(li);
    }
}
