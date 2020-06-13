/**
 * Second
 */
public class Second {

    public static int multiply(int a, int b){
        int k = a * b;
        return k;
    }

    public static void vordlus(int age){
        // kui inimene on üle 100, siis ütleb midagi muud
        if(age < 18){
            System.out.println("Alakas");
        }else if(age > 100){
            System.out.println("Üle sajandi");
        }else{
            System.out.println("Täisealine");
        }
    }



    public static void main(String[] args) {
        int f = multiply(5, 5);
        System.out.println("Arv on: " + f);
        vordlus(13);
        vordlus(18);
        vordlus(14000);
        vordlus(100);
        
        int[] arr = {5, 3, 2};
        
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}