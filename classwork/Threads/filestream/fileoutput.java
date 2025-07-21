package Threads.filestream;
import java.io.FileWriter;
import java.io.IOException;

public class fileoutput{
    public static void main(String[] args) {
        try (FileWriter myWriter = new FileWriter("C:\\Users\\charv\\OneDrive\\Desktop\\javaone\\Threads\\filestream\\file")) {
            myWriter.write("aryan and uid:23bcs13909");
            System.out.println("Successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
