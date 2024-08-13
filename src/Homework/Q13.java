package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Q13 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        //Use EnsureCapacity when u need to resize arraylist
        //Provides better optimization to add elements
        //Use before add operation to improve runtime
        arr.ensureCapacity(10);

        Collections.addAll(arr, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        ListIterator<Integer> it = arr.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
