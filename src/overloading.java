class java2{
    public void add(int a,int b)
    {

        System.out.println(a+b);
    }
    public void add(int a,int b,int c)

    {
        System.out.println(a+b+c);
    }
}
    public class overloading {
    public static void main(String[] args) {
        java2 obj = new java2();
        obj.add(2,6);
        obj.add(6,8,6);
    }
}
