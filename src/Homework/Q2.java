package Homework;

import java.util.Collections;
import java.util.HashSet;
//HashSet with String and forEach
public class Q2 {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>(10);

        Collections.addAll(st, "1", "2", "3", "4", "5");
        st.add("6");
        st.add("7");
        st.add("8");
        st.add("9");
        st.add("10");

        st.forEach(no -> System.out.print(no + " "));
    }
}
