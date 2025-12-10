import java.util.*;
class person{
    public void details(String name,int age){

        System.out.println(name + " " +age);
    }
}
public class usermethods1 {
    public static void main(String[] args) {
      person obj = new person();
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person details:");
        String name = sc.nextLine();
        int age = sc.nextInt();
         obj.details(name,age);
    }
}
