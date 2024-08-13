import java.util.Iterator;
import java.util.Stack;

public class Q7 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 5; i++) stack.push(i);

        Iterator<Integer> iterator = stack.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
