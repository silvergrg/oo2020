import java.util.Random;
import java.util.Scanner;
/**
 * Fourth
 */
public class Fourth {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        boolean playing = true;

        int a = r.nextInt(5);
        //Kasutajal on 3 elu. Valesti vastamise korral elu kaob
        int lives = 3;
        while(playing){
            System.out.println("Mis arv on :");
            int b = in.nextInt();
            if(b == a){
                playing = false;
                System.out.println("Winner!");
            }else if(lives > 1){
                System.out.println("Vale! Arva uuesti:");
                // Selline kirjaviis on üldisem kui "--", saab peale 1 kasutada muid numbreid
                lives -=1;
            }else{
                System.out.println("Vale! Mäng läbi!");
                playing = false;
            }

        }
        in.close();
    }
}