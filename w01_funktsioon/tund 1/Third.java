import java.util.Scanner;
/**
 * Third
 */
public class Third {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String name;
        //System.out.println("Sisestage oma nimi:");
        //name = input.nextLine();
        //System.out.println("Sinu nimi on " + name);

        // Kasutaja annab kaks arvu, need arvud välja printida, siis kokku  liita ja selle tulemus välja printida

        System.out.println("Sisesta kaks arvu:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("Sisestatud arvud on: " + a + " ja " + b);
        //double c = a + b;
        //System.out.println("Nende summa on: " + c);
        // Sellest parem meetod, säästab ridu ja mälu:
        System.out.println("Nende summa on " + (a+b));
        input.close();
    }
}