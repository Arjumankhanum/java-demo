import java.util.Scanner;
public class Condition3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        if (a >=0) {
            System.out.println(a +" is positive");
        } else {
            System.out.println(a + " is negative");
        }
    }
}