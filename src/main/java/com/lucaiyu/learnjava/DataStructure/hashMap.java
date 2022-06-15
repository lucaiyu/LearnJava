package main.java.com.lucaiyu.learnjava.DataStructure;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer, String>();
        map.put(1,"1");
        map.put(2, "2");
        map.put(3, "3");
        System.out.println(map);
        System.out.println(map.get(1));
        map.remove(3);
        System.out.println(map.size());
        map.clear();
        System.out.println(map);
    }
}
