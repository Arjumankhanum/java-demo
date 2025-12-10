import java.util.PriorityQueue;

public class collect2 {
    public static void main(String[] args) {
       /* PriorityQueue<String> name =  new PriorityQueue<>();
        name.offer("Anil");
        name.offer("varun");
        name.offer("ajay");
        System.out.println(name);
        System.out.println(name.poll());
        */
        PriorityQueue <Integer> name = new PriorityQueue<>();
        name.offer(3);
        name.offer(1);
        name.offer(8);
        name.offer(2);
        name.offer(9);
        name.offer(4);
        System.out.println(name);
        System.out.println(name.poll());
        System.out.println(name);
        System.out.println(name.peek());
    }
}

