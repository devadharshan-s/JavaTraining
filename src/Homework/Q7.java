package Homework;

import java.util.Collections;
import java.util.HashSet;

//retainAll -> retain only contains common elements
public class Q7 {
    public static void main(String[] args) {
        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();

        Collections.addAll(st1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collections.addAll(st2, 1, 2, 3, 4, 5);

        st1.retainAll(st2);

        System.out.println(st1);

    }
}
