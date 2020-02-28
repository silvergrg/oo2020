import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * jagamine
 */
public class jagamine {

    

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("jagasis.txt"));

        int N = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        List<Integer> baskets = new ArrayList<>();

        //Korvide list
        while(line != null){
            baskets.add(Integer.parseInt(line));
            line = reader.readLine();
        }
        reader.close();

        //Pool kõigi õunte hulgast
        int SUM_total = 0;
        for(int i = 0; i < N; i++){
            SUM_total += baskets.get(i);
        }
        int HALF_total = SUM_total / 2;

        int divider = 1;
        boolean solved = false;

        //Jagamiskoha asukoha leidmine
        while(solved == false){
            int SUM_left = 0;
            for(int i = 0; i < divider; i++){
                SUM_left += baskets.get(i);
            }
            if(SUM_left >= HALF_total){
                if(Math.abs(SUM_total - 2* SUM_left) <= Math.abs(SUM_total - 2* SUM_left - 2* baskets.get(divider))){
                    solved = true;
                }else{
                    divider--;
                    solved = true;
                }
            }else{
                divider++;
            }
        }
        /*
        System.out.println(divider);
        System.out.println(SUM_total);
        System.out.println(baskets);
        */
        BufferedWriter writer = new BufferedWriter(new FileWriter("jagaval.txt"));
        writer.write(Integer.toString(divider));
        writer.close();
    }
}
