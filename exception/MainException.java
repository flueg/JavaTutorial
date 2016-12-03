// Passing exceptions to the console.
import java.io.*;

public class MainException {
    // Throws exceptions to console in main method.
    public static void main(String[] args) throws Exception {
        // Open file
        FileInputStream file = new FileInputStream("MainException.java");
        // Close file
        file.close();
        throw new IOException();
    }
}
