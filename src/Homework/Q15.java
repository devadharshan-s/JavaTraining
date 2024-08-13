package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Q15 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> list1;

        Collections.addAll(list, 1, 2, 3, 4, 5);

        list1 = new ArrayList<>(list);

        System.out.println(list);
    }
}
