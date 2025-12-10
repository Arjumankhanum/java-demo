import java.util.Scanner;
public class array6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i< array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("array elements are: ");
        for(int i=0;i< array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
