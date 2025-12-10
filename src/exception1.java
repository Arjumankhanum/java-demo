public class exception1 {
    public static void main(String[] args) {
        int[] array ={2,1,7,2};
        try{
            System.out.println(array[5]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
