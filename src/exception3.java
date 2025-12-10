public class exception3 {
    public static void main(String[] args) {
        int[] a = {3, 1, 4, 6};
        try {
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("mandatory");
        }
    }
}
