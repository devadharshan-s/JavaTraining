import java.util.LinkedList;

public class Q3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        for(int i = 0; i < 5; i++) list.add(i);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
