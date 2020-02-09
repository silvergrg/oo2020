import java.util.Random;
/**
 * Ylesanne6
 */
public class Ylesanne6 {

    public static void BubbleSort(int[] arr){
        int temp = 0;
        int n_loops = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=1; j < arr.length; j++){
                n_loops++;
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Programmi loopide arv: " + n_loops);
    }

    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(9990) + 10;
        int[] arr = new int[a];
        for(int i=0; i < arr.length; i++){
            arr[i] = r.nextInt(100);
        }

        System.out.println("Sorteerimata array:");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        BubbleSort(arr);

        System.out.println("Sorteeritud array:");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

}