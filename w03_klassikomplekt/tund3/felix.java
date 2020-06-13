import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * felix
 */
public class felix {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("felix.txt"));
        List<String> cats = new ArrayList<>();

        String line = reader.readLine();
        while(line != null){
            cats.add(line);
            line = reader.readLine();
        }

        float avg = 0;
        float n_counter = 0;

        for(int i = 0; i < cats.size(); i++ ){
            String[] lineContent = cats.get(i).split(" ");
            if(lineContent[1] == "must"){
                avg += Integer.parseInt(lineContent[2]);
                n_counter ++;
            }
        }
        System.out.println("Keskmine on: " + (avg/n_counter));
        reader.close();
        
    }
}