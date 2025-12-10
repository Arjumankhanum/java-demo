import java.util.Vector;

public class collect7 {
    public static void main(String[] args) {
        Vector<Integer> rollno = new Vector<>();
        rollno.add(1);
        rollno.add(2);
        rollno.add(3);
        System.out.println(rollno); // [1, 2, 3]

        rollno.add(1, 5);
        System.out.println(rollno); // [1, 5, 2, 3]

        rollno.remove(2);
        System.out.println(rollno); // [1, 5, 3]

        System.out.println(rollno.size()); // 3
        System.out.println(rollno.get(1)); // 5
        System.out.println(rollno.set(1, 5)); // 5
        System.out.println(rollno); // [1, 5, 3]

        System.out.println(rollno.contains(5)); // true
        System.out.println(rollno.isEmpty());   // false
        System.out.println(rollno);             // [1, 5, 3]

        rollno.remove(2);
        System.out.println(rollno); // [1, 5]

        rollno.add(0, 9);                 // add first
        System.out.println(rollno);       // [9, 1, 5]
        rollno.add(rollno.size(), 0);     // add last
        System.out.println(rollno);       // [9, 1, 5, 0]

        rollno.clear();
        System.out.println(rollno);       // []
    }
}