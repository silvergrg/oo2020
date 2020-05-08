import org.junit.Test;

public class J6gi{
    private String nimetus;
    private double l2heX;
    private double l2heY;
    private double vahepunktX;
    private double vahepunktY;
    private double suueX;
    private double suueY;
    private J6gi sihtJ6gi;

    public J6gi(String nimetus, double l2heX, double l2heY, double vahepunktX, double vahepunktY, double suueX, double suueY, J6gi sihtJ6gi){
        this.nimetus = nimetus;
        this.l2heX = l2heX;
        this.l2heY = l2heY;
        this.vahepunktX = vahepunktX;
        this.vahepunktY = vahepunktY;
        this.suueX = suueX;
        this.suueY = suueY;
        this.sihtJ6gi = sihtJ6gi;

    }

    public double j6eAlgKaugusL6puni(){
        return Math.sqrt(Math.pow(suueX-l2heX, 2) +Math.pow(suueY-l2heY, 2));
    }

    public String j6eInfo(){
        return "Jõe nimi: " +nimetus+ " Lähtepunkti koordinaadid: (" +l2heX+ ";" +l2heY+ "). Suudme koordinaadid: (" +suueX+ ";" +suueY+ ")";
    }

    /*@Test
    public void j6eAlgKaugusL6puniT1(){

    }*/

    public double vahePunktX(){
        return vahepunktX;
    }

    public double vahePunktY(){
        return vahepunktY;
    }


    public double vaheptDistKontroll(double punktX, double punktY){ //Arvutab etteantud punkti kauguse jõe vahepunktini
        return Math.sqrt(Math.pow(vahepunktX-punktX, 2) +Math.pow(vahepunktY-punktY, 2));
    }

    public J6gi sihtJ6gi(){
        return sihtJ6gi;
    }
    
}