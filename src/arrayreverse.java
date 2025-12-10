import java.util.Scanner;

public class arrayreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value: ");
        int size= sc.nextInt();
        int [] array=new int[size];
        System.out.println("enter the array elements: ");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("The Reverse array elements: ");
        for(int i=array.length-1;i>=0;i--)
        {
            System.out.println(array[i]);
        }
    }
}




