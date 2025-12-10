public class array4 {
    public static void main(String[] args) {
        int array[] ={4,2,9,12,3,1};
        int small = array[0];
        for(int i =0;i<array.length;i++)
        {
            if (array[i] < small) {
                small = array[i];
            }
        }
        System.out.println("largest element is:" +small);
    }
}

