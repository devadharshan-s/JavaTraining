import java.util.Iterator;
import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();

        for(int i = 0; i < 9; i++) ll.add("Hello");

        Iterator<String> it = ll.iterator();

        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}
