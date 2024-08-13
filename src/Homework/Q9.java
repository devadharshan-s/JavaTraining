package Homework;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
//addAll -> copies from one set to another set
public class Q9 {
    public static void main(String[] args) {
        TreeSet<Integer> st1 = new TreeSet<>();
        TreeSet<Integer> st2 = new TreeSet<>();

        Collections.addAll(st1, 1,2,3,4,5,6,7,8,9,10);
        Collections.addAll(st2, 11,12,13,14,15);

        st1.addAll(st2);

        System.out.println(st1);
    }
}
