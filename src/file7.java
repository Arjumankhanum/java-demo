import java.io.FileInputStream;
import java.io.FileReader;

public class file7 {
    public static void main(String[] args) {
        try
                (FileInputStream obj = new FileInputStream("seven.txt")) {
            int c;
            while ((c = obj.read()) != -1) {
                System.out.print((char) c);//explict char in()
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}


