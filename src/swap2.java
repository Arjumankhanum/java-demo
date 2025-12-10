import java.util.Scanner;
public class swap2 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number a:");
            int a =sc.nextInt();
            System.out.println("enter the number b:");
            int b = sc.nextInt();
            a = a+b;
            b= a -b;
            a = a -b;
            System.out.println("A value is:" +a);
            System.out.println("B value is:" +b);
}
}