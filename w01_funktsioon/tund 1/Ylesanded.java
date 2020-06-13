import java.util.Scanner;
/**
 * Ylesanded
 */
public class Ylesanded {
    public static void compare(int a, int b){
        if(a<b){
            System.out.println("Teine arv on suurem");
        }else if(b>a){
            System.out.println("Esimene arv on suurem");
        }else{
            System.out.println("Arvud on võrdsed");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sisesta kaks täisarvu");
        int a = input.nextInt();
        int b = input.nextInt();
        compare(a, b);
        input.close();
    }
}