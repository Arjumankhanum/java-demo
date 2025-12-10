class outer4{
    void demo8()
    {
        class inner4{
            void demo9()
            {
                System.out.println("method local inner class");
            }
        }
        inner4 obj2 = new inner4();
        obj2.demo9();
    }
}
public class methodlocal {
    public static void main(String[] args) {
    outer4 obj = new outer4();
    obj.demo8();
    }
}
