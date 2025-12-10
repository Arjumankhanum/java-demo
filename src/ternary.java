import java.util.Scanner;
public class ternary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();
        int r =(a<b)?a:b;
        System.out.println(r);
    }
}
