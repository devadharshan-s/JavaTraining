package Homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

//Contains in 2 hashsets
public class Q6 {
    public static void main(String[] args) {

        HashSet<String> st1 = new HashSet<>();
        HashSet<String> st2 = new HashSet<>();

        Collections.addAll(st1, "a","b","c","d","e","f");
        Collections.addAll(st2, "a","b");
        System.out.println(st1.containsAll(st2));
        //st1.forEach(str -> System.out.println(str + " " + st2.contains(str)));
    }
}
