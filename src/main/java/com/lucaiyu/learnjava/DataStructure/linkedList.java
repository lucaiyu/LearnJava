package main.java.com.lucaiyu.learnjava.DataStructure;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.addFirst("0");
        System.out.println(list);
    }
}
