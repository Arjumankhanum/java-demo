import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class file2{
    public static void main(String[] args) {
        String s="three.png";
        try
        {
            Files.write(Paths.get(s),"hello java developers".getBytes());
            System.out.println("created successfully");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

