import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Largest is" + a);
        } else {
            System.out.println("Largest is" + b);
        }
    }
}

