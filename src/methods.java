class java{
    public void greet()//method declaration
    {
        System.out.println("Hello Developer");
    }
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
}


public class methods {
    public static void main(String[] args) {
        java obj = new java();
        obj.greet();
        int r=obj.add(4,1);
        System.out.println(r);
        int s = obj.sub(9,7);
        System.out.println(s);//method call
    }
}
