package DataStructure;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("114514");
        System.out.println(list);
        System.out.println(list.get(0));
        list.set(0,"0");
        System.out.println(list.get(0));
        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());
    }
}
