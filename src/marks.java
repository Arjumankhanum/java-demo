import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks between 0 to 100");
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("Grade is A");
        } else if (marks > 80) {
            System.out.println("Grade is B");
        } else if (marks > 70) {
            System.out.println(" Grade is C");
        } else if (marks > 60) {
            System.out.println(" Grade is D");
        } else if (marks > 50) {
            System.out.println(" Grade is E");
        } else {
            System.out.println("Fail");
        }
    }
}