class A{
    A()
    {
        System.out.println("hello");
    }
    A(int a)
    {
        System.out.println(a);
    }
    A(int a,int b)
    {
        System.out.println(a +" " +b);
    }
}
public class const1 {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A(3);
        A obj2 = new A(2 , 5);
}
}