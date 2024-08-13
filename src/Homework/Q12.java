package Homework;

import java.util.ArrayList;
import java.util.Collections;

public class Q12 {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        Collections.addAll(arr, "a","b","c","d","e","f","g");

        arr.forEach(i -> System.out.print(i + " "));
        System.out.println();
        arr.clear();

        System.out.println("ArrayList after removing all elements");
        System.out.println(arr);
    }
}
