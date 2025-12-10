import java.util.*;

public class collect5 {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("orange");
        System.out.println(fruits);
        fruits.add(1, "Grapes");
        System.out.println(fruits);
        fruits.remove(3);
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.get(1));
        System.out.println(fruits.set(2, "kivi"));
        System.out.println(fruits);
        System.out.println(fruits.contains("Banana"));
        System.out.println(fruits.isEmpty());
        fruits.remove("Grapes");
        System.out.println(fruits);
        fruits.addFirst("Strawberry");
        System.out.println(fruits);
        fruits.addLast("chicko");
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
    }
}
