import java.util.Scanner;

class company{
    public void employee(String name,int salary,String role){
         System.out.println(name + " " +salary +" " + role);
}
    public void department(int DID,String deptname){

        System.out.println(DID +" " + deptname);
    }
}

public class employee1
{
    public static void main(String[] args) {
        company obj = new company();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person details:");
        System.out.print("Enter name:");
        String name = sc.nextLine();
        System.out.print("Enter salary:");
        int salary = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter role: ");
        String role = sc.nextLine();
        System.out.print("Enter Department ID: ");
        int DID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department name: ");
        String deptname = sc.nextLine();
        obj.employee(name,salary,role);
        obj.department(DID,deptname);
    }
}

