import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
/**
 * yl3
 */
public class yl3 {

    // Massiivi sorteerimine Bubble sort meetodil
    public static int[] BubbleSort(int[] massiiv, int len){
        int temp = 0;
        for(int i=0; i < len; i++){
            for(int j=1; j < len; j++){
                if(massiiv[j-1] > massiiv[j]){
                    temp = massiiv[j-1];
                    massiiv[j-1] = massiiv[j];
                    massiiv[j] = temp;
                }
            }
        }
        return massiiv;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sisend.txt"));
        //Failist algandmete sisselugemine
        int pikkus = 0;
        String line = reader.readLine();
        String Raw_alg= "";
        while(line != null){
            pikkus +=1;
            Raw_alg += line + " ";
            line = reader.readLine();
        }
        reader.close();
        
        //Algandmete vormistamine listiks ja sorteerimine
        int[] alg = new int[pikkus];
        for(int i = 0; i < pikkus; i++){
            alg[i] = Integer.parseInt(Raw_alg.split(" ")[i]);
        }
        int[] sorteeritud = BubbleSort(alg, alg.length);

        //Väljundfaili kirjutamine
        BufferedWriter writer = new BufferedWriter(new FileWriter("valjund.txt"));
        writer.write("Arvud, mis on alla 50%: " + "\n");
        for(int i = 0; i < pikkus/2; i++){
            writer.write(sorteeritud[i] + " ");
        }
        writer.write("\nArvud, mis on 25% ja 75% vahel: \n");
        for(int i = 0; i < pikkus/2; i++){
            writer.write(sorteeritud[(pikkus/4) + i] + " ");
        }
        writer.write("\nArvud, mis on üle 25%: \n");
        for(int i = 0; i < pikkus*3/4; i++){
            writer.write(sorteeritud[(pikkus/4) + i] + " ");
        }
        writer.write("\nAlgarvud: \n");
        
        for(int i = 0; i < pikkus; i++){
            boolean onAlgarv = true;
            for(int j = 2; j < Math.round(Math.sqrt(sorteeritud[i]))+1; j++){
                if(sorteeritud[i] % j == 0){
                    onAlgarv = false;
                }
            }
            if(onAlgarv == true){
                writer.write(sorteeritud[i] + " ");
            }
        }
        
        
        writer.close();
        
    }
}