import java.util.Scanner;
public class switch2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the marks between 0 to 100");
            int marks = sc.nextInt();
            switch (marks)
            {
                case 90:
                    System.out.println("Grade is A");
                    break;
                case 80:
                    System.out.println("Grade is B");
                    break;
                case 70:
                    System.out.println("Grade is C");
                    break;
                case 60:
                    System.out.println("Grade is D");
                    break;
                case 50:
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;

            }
        }
}


