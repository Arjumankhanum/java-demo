public class exception2 {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("mandatory");
        }
    }
}
