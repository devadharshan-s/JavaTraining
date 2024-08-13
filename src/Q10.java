import java.util.LinkedList;
import java.util.ListIterator;

public class Q10 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 1; i < 11; i++) ll.add(i);

        ll.remove(5);

        ListIterator<Integer> li = ll.listIterator();

        while (li.hasNext()) {
            System.out.print(li.next() + " ");
        }
    }
}
