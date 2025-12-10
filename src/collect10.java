import java.util.LinkedHashSet;

public class collect10 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> n = new LinkedHashSet<>();
        n.add(30);
        n.add(1);
        n.add(14);
        n.add(2);
        System.out.println("TreeSet: " + n);
        n.remove(30);
        System.out.println("After removing 30: " + n);
        System.out.println("Contains 14? " + n.contains(14));
        System.out.println("Hash code: " + n.hashCode());

        n.clear();
        System.out.println("After clear: " + n);
        System.out.println("Is empty? " + n.isEmpty());
    }
}


