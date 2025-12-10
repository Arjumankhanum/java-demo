class java21{
    public void demo()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("java developers");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
class react{
    public void demo()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("react developers");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
}



public class thread2 {
    public static void main(String[] args) {
        java21 obj1 = new java21();
        react obj2 =  new react();
        obj1.demo();
        obj2.demo();
    }
}
