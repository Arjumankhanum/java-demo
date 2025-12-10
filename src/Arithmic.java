import java.util.Scanner;
public class Arithmic {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        System.out.println("Increment a: " + a++);
        System.out.println("Decrement a: " + --a);
        System.out.println("Increment b: " + b++);
        System.out.println("Decrement b: " + --b);
    }
}
