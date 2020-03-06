/**
 * yl1
 */
public class yl1 {

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

    public static void main(String[] args) {
        // Algne massiiv
        int[] alg = {5,2,64,123,7,2,1,23,46,1,2,6};
        System.out.println("Sorteerimata: ");
        for(int i=0; i < alg.length; i++){
            System.out.print(alg[i] + ", ");
        }
        System.out.println();

        int[] sorteeritud = BubbleSort(alg, alg.length);

        System.out.println("Sorteeritud: ");
        for(int i=0; i < sorteeritud.length; i++){
            System.out.print(sorteeritud[i] + ", ");
        }
        System.out.println();

        //Sorteeritud massiivist suurima ja vähima leidmine
        System.out.println("Suurim on: " + sorteeritud[sorteeritud.length-1] + " ja vähim on: " + sorteeritud[0]);

        //Sorteerimata masiivist suurima ja vähima leidmine
        int v2him = 999999999;
        int suurim = 0;
        for(int i = 0; i < alg.length; i++){
            if(alg[i] < v2him){
                v2him = alg[i];
            }
            if(alg[i] > suurim){
                suurim = alg[i];
            }
        }
        System.out.println("Suurim on: " + suurim + " ja vähim on: " + v2him);
        
    }
}