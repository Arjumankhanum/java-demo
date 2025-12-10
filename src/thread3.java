class java211 extends Thread{
    public void run()
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
class react1 extends Thread{
    public void run()
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



public class thread3 {
    public static void main(String[] args) {
        java211 obj1 = new java211();
        react1 obj2 =  new react1();
        obj1.start();
        obj2.start();
    }
}

