import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~b);
        System.out.println(a<<2);
        System.out.println(a>>2);
    }
}


