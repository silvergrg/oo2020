import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//import java.nio.Buffer;

/**
 * WriteFile
 */
public class WriteFile {

    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("test.txt"));

        String line = "Hello world";
        writer.write(line + "\n");
        writer.write(line + "\n");
        writer.write(line + "\n");
        writer.write(line + "\n");
        writer.close();
    }
}