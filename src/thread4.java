class javaa implements Runnable{
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
class react12 implements Runnable{
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






public class thread4 {
    public static void main(String[] args) {
        javaa obj1 = new javaa();
        react12 obj2 = new react12();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
