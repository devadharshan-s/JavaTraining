package Homework;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Q10 {
    public static void main(String[] args) {
        TreeSet<Integer> st = new TreeSet<>();

        Collections.addAll(st, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Iterator it = st.descendingIterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
