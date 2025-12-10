import java.io.FileOutputStream;

public class file1
{
    public static void main(String[] args)
    {
        String s="two.jpg";
        try(FileOutputStream obj=new FileOutputStream(s))
        {
            System.out.println("file is created successfully");
        }
        catch (Exception e)
        {
            System.out.println("failed to create");
        }
    }
}

