package Homework;

import java.util.Collections;
import java.util.LinkedList;

public class Q14 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        Collections.addAll(list, 10,24,36,48,59);

        int s = list.size();

        for(int i = 0; i < s; i++) System.out.print(i + "->" + list.get(i) + " ");
    }
}
