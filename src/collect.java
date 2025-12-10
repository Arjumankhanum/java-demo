import java.util.*;

public class collect {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();
        number.push(3);
        number.push(1);
        number.push(7);
        System.out.println(number);
        number.pop();
        System.out.println(number);
        System.out.println(number.isEmpty());
        System.out.println(number.capacity());
        System.out.println(number.iterator());

    }
}
