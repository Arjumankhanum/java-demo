abstract class demo5
{
    String name;
    demo5(String name)
    {

        this.name = name;
    }
    abstract void details();
}
class ab5 extends demo5{
    ab5(String name)
    {
        super(name);
    }
    void details(){

        System.out.println("arjuman");
    }
}
public class ab4 {
    public static void main(String[] args) {
        ab5 obj5 = new ab5("arjuman");
        obj5.details();
    }
}
