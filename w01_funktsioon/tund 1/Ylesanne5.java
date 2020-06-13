import java.util.Scanner;

/**
 * Ylesanne5
 */
public class Ylesanne5 {
    //Sisestatud Celsiuse kraadides temperatuuri teisendamine Fahrenheit kraadideks
    public static void CtoF(double temperature){
        double temperatureF = temperature * 1.8 + 32;
        System.out.println("See on: " + temperatureF + "F");
    }

    //Sisestatud Fahrenheit kraadides temperatuuri teisendamine Celsius kraadideks
    public static void FtoC(double temperature){
        double temperatureC = (temperature - 32) / 1.8;
        System.out.println("See on: " + temperatureC + "C");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kas sisestad C või F?");
        String type = input.nextLine();
        System.out.println("Sisesta temperatuur: ");
        double temperature = input.nextDouble();
        if(type.equals("c")){
            CtoF(temperature);
        }else if(type.equals("f")){
            FtoC(temperature);
        }else{
            System.out.println("Ei saa aru!");
        }
        input.close();
    }
}