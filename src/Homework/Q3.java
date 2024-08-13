package Homework;

import java.util.Collections;
import java.util.HashSet;
//HashSet with copy with constructor
public class Q3 {
    public static void main(String[] args) {
        HashSet<Integer> start = new HashSet<>(5);

        Collections.addAll(start,1,2,3,4,5);

        HashSet<Integer> res = new HashSet<>(start);

        System.out.println(res);
    }
}
