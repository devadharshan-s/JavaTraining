package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
//Search an Element
public class Q11 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Collections.addAll(arr, 1,10,45,67,12,56,98,12,75);

        int search = 56;
        boolean found = false;
        ListIterator<Integer> iter = arr.listIterator();

        while (iter.hasNext()) {
//            System.out.println(iter);
            if(iter.next() == search) {
                System.out.println("Found");
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Not found");
        }
    }
}
