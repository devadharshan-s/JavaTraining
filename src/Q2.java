import java.util.ArrayList;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(10);

        for(int i = 0; i < 10; i++) arr.add(Integer.toString(i));

        Iterator it = arr.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
