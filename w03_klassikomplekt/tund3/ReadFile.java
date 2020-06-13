import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * ReadFile
 */
public class ReadFile {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("hello.txt"));
        String line = reader.readLine();
        System.out.println(line);

        String[] lineContent = line.split(" ");
        System.out.println(lineContent.length);
        System.out.println(lineContent[0]);
        System.out.println(lineContent[1]);
        reader.close();
    }
}