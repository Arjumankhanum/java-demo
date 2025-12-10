import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class file8 {
    public static void main(String[] args) {
        try
        {
            List<String> obj= Files.readAllLines(Paths.get("seven.txt"));
            for (String s:obj)
            {
                System.out.println(s);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}