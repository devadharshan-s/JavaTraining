import java.util.Comparator;

public class NameComparator implements Comparator{
    public int compare(Object o1, Object o2) {
        String name1 = (String)o1;
        String name2 = (String)o2;
        return name1.compareTo(name2);
    }
}
