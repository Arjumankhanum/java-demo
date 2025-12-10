import java.io.FileOutputStream;
public class file4
{
    public static void main(String[] args)
    {
        String content="hello java full stack";
        try(FileOutputStream obj=new FileOutputStream("seven.txt"))
        {
            System.out.println("file created");
            byte[] bytes=content.getBytes();
            obj.write(bytes);
        }
        catch (Exception e)
        {
            System.out.println("not created");
        }
    }
}
