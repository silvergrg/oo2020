/**
 * HarjutusYl1
 */
public class HarjutusYl1 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 58, 35, 673, 37, 23, 1, 0, 5, 124, 81};

        int temp_total = 0;
        for(int i = 0; i < arr.length; i++){
            temp_total += arr[i];
        }
        float average = temp_total / arr.length ;
        System.out.println(average);

        int large_counter = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > average){
                large_counter++;
            }
        }
        System.out.println(large_counter);
    }
}