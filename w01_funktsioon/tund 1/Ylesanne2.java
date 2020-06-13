/**
 * Ylesanne2
 */
public class Ylesanne2 {

    public static void main(String[] args) {
        int[] arr = {12, 99, 0, 3, 4, 5};
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Suurim arv on: " + max);
    }
}