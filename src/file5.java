import java.nio.file.Files;
import java.nio.file.Paths;

public class file5 {
    public static void main(String[] args) {
        String content="welcome";
        try{
            Files.write(Paths.get("seven.txt"),content.getBytes());
            System.out.println("Created sucessfully");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}