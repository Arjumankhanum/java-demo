abstract class ab3 {
    abstract void person(String name, int age);
}
class ab extends ab3//override ab3
{
    void person(String name,int age)

    {

        System.out.println(name+" "+age);
    }
}
    public class ab2{
    public static void main(String[] args) {
        ab obj = new ab();
        obj.person("arjuman",22);

    }
}
