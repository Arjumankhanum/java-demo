interface A21{
    void greet();
}
class demo9 implements A21{
    public void greet()

    {

        System.out.println("interface in java");
    }
}


public class interface1 {
    public static void main(String[] args) {
        demo9 obj = new demo9();
                obj.greet();
    }
}
