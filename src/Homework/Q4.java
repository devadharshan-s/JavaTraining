package Homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

//Remove Last element and removeAll method
public class Q4 {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>(10);

        Collections.addAll(st, "a", "b", "c", "d", "e", "f","g","h","i","j");

        st.remove("j");
        HashSet<String> remove = new HashSet<>(Arrays.asList("a","b"));
        st.removeAll(remove);
        System.out.println(st);
    }
}