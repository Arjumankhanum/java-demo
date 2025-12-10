import java.util.Scanner;
public class arrayy8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for (int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        int largeNumber = array[0];
        for (int i=0;i<size;i++)
        {
            if(array[i]>largeNumber)
            {
                largeNumber = array[i];
            }
        }
        System.out.println("First Largest Number: " + largeNumber);
        int secondLargestNumber = 0;
        for(int i=0; i<size;i++)
        {
            if(array[i]!=largeNumber){
                if(array[i]>secondLargestNumber)
                {
                    secondLargestNumber = array[i];
                }
            }
        }
        System.out.println("Second Largest Number: " + secondLargestNumber);
    }
}