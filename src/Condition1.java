import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();
        if(age> 18) {
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Better try next year");
        }
        }
}
