import java.util.LinkedList;
import java.util.ListIterator;

public class Q9 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 1; i < 11; i++) ll.add(i);

        ListIterator<Integer> li = ll.listIterator(2);

        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
    }
}
