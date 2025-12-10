import java.io.File;

public class file
{
    public static void main(String[] args)
    {
        File obj=new File("one.txt" );
        try
        {
            if (obj.createNewFile())
            {
                System.out.println("file is created successfully");
            }
            else
            {
                System.out.println("failed to create file");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);

        }
    }
}

