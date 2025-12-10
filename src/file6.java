import java.io.FileReader;

public class file6 {
    public static void main(String[] args) {
        try
                (FileReader obj = new FileReader("seven.txt")) {
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

