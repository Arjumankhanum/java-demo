import java.util.*;

public class collect9 {
    public static void main(String[] args) {
        TreeSet<Integer> n = new TreeSet<>();
        n.add(30);
        n.add(1);
        n.add(14);
        n.add(2);
        System.out.println("TreeSet: " + n);
        n.remove(30);
        System.out.println("After removing 30: " + n);
        System.out.println("Contains 14? " + n.contains(14));


        System.out.println("First element: " + n.first());
        System.out.println("Last element: " + n.last());


        System.out.println("Ceiling of 2: " + n.ceiling(2));
        System.out.println(n);
        System.out.println("Floor of 14: " + n.floor(13));


        System.out.println("Higher than 2: " + n.higher(2));
        System.out.println("Lower than 2: " + n.lower(2));


        System.out.println("Hash code: " + n.hashCode());


        n.clear();
        System.out.println("After clear: " + n);
        System.out.println("Is empty? " + n.isEmpty());
    }
}
