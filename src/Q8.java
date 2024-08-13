import java.util.Iterator;
import java.util.Stack;

public class Q8 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < 5; i++) stack.push("Hello");

        Iterator<String> iterator = stack.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
