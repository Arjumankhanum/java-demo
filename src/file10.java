import java.io.File;

public class file10 {
    public static void main(String[] args) {
        File obj = new File("seven.txt");
        if (obj.exists()) {
            if (obj.delete()) {
                System.out.println("file deleted succesfully");
            } else {
                System.out.println("failed to delete file");
            }
        } else {
            System.out.println("file not exists");
        }
    }
}