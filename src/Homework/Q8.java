package Homework;

import java.util.Collections;
import java.util.TreeSet;
//TreeSet
public class Q8 {
    public static void main(String[] args) {

        TreeSet<Integer> st = new TreeSet<>();

        Collections.addAll(st, 1, 3, 2, 4, 5, 6, 7, 8, 9, 10);

        st.forEach(i -> System.out.print(i + " "));
    }
}
