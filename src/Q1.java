import java.util.*;

public class Q1 {
    public static void main(String[] args) {
       ArrayList<Integer> arr = new ArrayList<>(10);
       for(int i = 0; i < 10; i++) arr.add(i);
       Iterator it = arr.iterator();
       while (it.hasNext()) {
           System.out.print(it.next() + " ");
       }
    }
}