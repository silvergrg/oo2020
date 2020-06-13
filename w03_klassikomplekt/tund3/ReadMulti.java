import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
/**
 * ReadMulti
 */
public class ReadMulti {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("hello2.txt"));
        List<String> lines = new ArrayList<>();
        String line = reader.readLine();
        while(line != null){
            lines.add(line);
            line = reader.readLine();
        }

        for(String string : lines){
            System.out.println(string);
        }
        reader.close();
    }
}