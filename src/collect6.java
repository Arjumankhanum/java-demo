import java.util.*;

public class collect6 {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("benz");
        cars.add("bnw");
        cars.add("swift");
        cars.add(1, "Safari");
        System.out.println(cars);            // [benz, Safari, bnw, swift]

        cars.addFirst("bollero");
        System.out.println(cars);            // [bollero, benz, Safari, bnw, swift]

        cars.addLast("kia");
        System.out.println(cars);            // [bollero, benz, Safari, bnw, swift, kia]

        System.out.println(cars.indexOf("benz")); // 1

        System.out.println(cars.peek());     // bollero
        System.out.println(cars);            // list unchanged

        System.out.println(cars.poll());     // bollero removed
        System.out.println(cars);            // [benz, Safari, bnw, swift, kia]

        cars.offer("creta");
        System.out.println(cars);            // [benz, Safari, bnw, swift, kia, creta]
    }
}
