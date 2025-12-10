import java.io.*;
public class file11 {
    public static void main(String[] args) {
                try {
                    // 1. Create a file
                    File file = new File("sample.txt");
                    if (file.createNewFile()) {
                        System.out.println("File created: " + file.getName());
                    } else {
                        System.out.println("File already exists");
                    }

                    // 2. Write to the file
                    FileWriter writer = new FileWriter("sample.txt");
                    writer.write("Hello Java Developers\nWelcome to file handling!");
                    writer.close();
                    System.out.println("Successfully wrote to the file");

                    // 3. Read the file
                    BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
                    String line;
                    System.out.println("Reading File:");
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }
                    reader.close();

                    // 4. Delete the file
                    if (file.delete()) {
                        System.out.println("File deleted successfully");
                    } else {
                        System.out.println("Failed to delete the file");
                    }

                } catch (IOException e) {
                    System.out.println("An error occurred: " + e);
                }
            }
        }


