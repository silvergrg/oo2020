import java.util.Random;
import java.util.Arrays;
/**
 * harjutus1
 */
public class harjutus1 {

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(20);
        int[] arr = new int[a];
        for(int i=0; i < arr.length; i++){
            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr)); 
        //int[] arr = {1,2,3,4,5,6,7,8,9};
        int n_even = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                n_even++;
            }
        }
        System.out.println("Paaris arve on loendis:" + n_even);
    }
}