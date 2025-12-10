class mult extends Thread
{
    public void run()
    {
        System.out.println("Thread 1");
    }
}
class multi21 extends  Thread{

    public void run()
    {

        System.out.println("Thread2  ");
    }
}

public class thread1 {
    public static void main(String[] args) {
        Thread obj =  new mult();
        obj.start();
        Thread obj2 = new multi21();
        obj2.start();
    }
}
