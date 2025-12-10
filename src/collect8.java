import java.util.*;

public class collect8 {
    public static void main(String[] args) {
        Set<Integer> n = new HashSet<>();
        n.add(30);
        n.add(1);
        n.add(14);
        n.add(2);
        System.out.println(n);
        n.remove(30);
        System.out.println(n);
        System.out.println(n.contains(14));
        n.iterator();
        System.out.println(n);
        System.out.println(n.hashCode());
        n.clear();
        System.out.println(n);
        System.out.println(n.isEmpty());

    }
}
