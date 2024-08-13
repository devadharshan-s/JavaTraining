import java.util.Iterator;
import java.util.Vector;

public class Q5 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        for(int i = 0; i < 4; i++) v.add(i);

        Iterator it = v.iterator();

        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}
