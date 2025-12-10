import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array elements: ");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        //System.out.println("Enter the array elements: ");
        int sum=0; // sum of the elements
        for(int i=0;i<size;i++)
        {
            sum+=array[i]; // sum=sum+array[i]
        }
        System.out.println("sum of array is: "+sum);
        int avg=sum/size; // find out the average of the element
        System.out.println("avg is: "+avg);
    }
}

