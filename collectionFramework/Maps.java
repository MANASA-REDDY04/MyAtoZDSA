package collectionFramework;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
       // HashMap<Integer,String> hm = new HashMap<>();
        // treemap implements BST stores in sorted format
        TreeMap<Integer,String> hm = new TreeMap<>();
        hm.put(0,"aloo");
        hm.put(4,"vankaya");
        hm.put(2,"egg");
        hm.put(3,"velipaya");
        System.out.println(hm);

        if(!hm.containsKey(2))
            hm.put(2,"chole");
                //or
        hm.putIfAbsent(2,"sorakaya");

        System.out.println(hm);
        System.out.println(hm.containsKey(1) + " " + hm.containsValue("chole"));

        for(Map.Entry<Integer,String> e: hm.entrySet()){
            System.out.print(e.getKey());
            System.out.print(e.getValue());
        }

        for(Integer key: hm.keySet())
            System.out.println(key);

        for(String val: hm.values())
            System.out.println(val);

        System.out.println(hm.isEmpty());
        hm.remove(0);
        System.out.println(hm);
    }
}
