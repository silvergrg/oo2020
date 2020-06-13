import java.util.Scanner;
/**
 * Ylesanne4
 */
public class Ylesanne4 {
    // Abifunktsioon ringi ümbermõõdu ja pindala leidmiseks
    public static void circleCalcs(double r){
        double perimeter = r * 6.28;
        System.out.println("Ringi ümbermõõt on: " + perimeter);
        double surface = r * r * 3.14;
        System.out.println("Ringi pindala on: " + surface);
    }
    //Abifunktsioon ruudu ümbermõõdu ja pindala leidmiseks
    public static void squareCalcs(double side){
        double perimeter = side * 4;
        System.out.println("Ruudu ümbermõõt on: " + perimeter);
        double surface = side * side;
        System.out.println("Ruudu pindala on: " + surface);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kas sa tahad arvutada ringi või ruudu ümbermõõtu? (ring/ruut)");
        String answer = input.nextLine();
        if(answer.equals("ring")){
            System.out.println("Sisesta ringi raadius: ");
            double r = input.nextDouble();
            circleCalcs(r);
        }else if(answer.equals("ruut")){
            System.out.println("Sisesta ruudu külje pikkus: ");
            double side = input.nextDouble();
            squareCalcs(side);
        }else{
            System.out.println("Ei saa aru!");
        }
        input.close();
    }
}