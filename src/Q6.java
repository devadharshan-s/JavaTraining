import java.util.Iterator;
import java.util.Vector;

public class Q6 {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        for(int i = 0; i < 10; i++) v.add("hello");

        Iterator<String> it = v.iterator();
        while(it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }
}
