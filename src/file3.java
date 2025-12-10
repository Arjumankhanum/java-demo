import java.io.File;
import java.io.FileWriter;

public class file3

{
    public static void main(String[] args)
    {
        File obj=new File("four.txt");
        try
        {
            if(obj.createNewFile())
            {
                System.out.println("file is created");
            }
            else
            {
                System.out.println("failed");
            }
            FileWriter obj1=new FileWriter("four.txt");
            obj1.write("bangalore is coolest city");
            obj1.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
