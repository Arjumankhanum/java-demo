class outer11{
    private int age = 18;
    public class inner1{
        int getValue()
        {
            return age;
        }
    }
}
public class outer111 {
    public static void main(String[] args) {
    outer11 obj = new outer11();
    outer11.inner1 obj2 = obj.new inner1();
        System.out.println(obj2.getValue());

    }
}
