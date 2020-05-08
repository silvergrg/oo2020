
public class Main {

    public static double punktideVahKaugus(double X1, double X2, double Y1, double Y2){
        return Math.sqrt(Math.pow(X1-X2, 2) +Math.pow(Y1-Y2, 2));
    }

    public static void main(String[] args) {
        J6estik j6ed = new J6estik();
        J6gi J6gi1 = new J6gi("Pirita jõgi", 25000d,52000d, 9000d,29000d, 0d,0d, null);
        J6gi J6gi2 = new J6gi("Kuivajõgi", 19000d,46000d, 12000d,34000d, 9000d,29000d, J6gi1);
        J6gi J6gi3 = new J6gi("Kauste oja", 13000d,40000d, 12000d,37000d, 12000d,34000d, J6gi2);
        j6ed.lisaJ6gi(J6gi1);
        j6ed.lisaJ6gi(J6gi2);
        j6ed.lisaJ6gi(J6gi3);

        //System.out.println(J6gi1.j6eInfo());
        //j6ed.list();

        double kontrollPunktX = 10000;
        double kontrollPunktY = 33000;

        //System.out.println(J6gi1.vaheptDistKontroll(kontrollPunktX, kontrollPunktY));
        
        J6gi l2himJ6gi = null;
        double l2bitudTee = 0;
        

        
        if(J6gi3.vaheptDistKontroll(kontrollPunktX, kontrollPunktY)<J6gi2.vaheptDistKontroll(kontrollPunktX, kontrollPunktY)){
            l2himJ6gi = J6gi3;
            l2bitudTee += J6gi3.vaheptDistKontroll(kontrollPunktX, kontrollPunktY);
        }else if(J6gi2.vaheptDistKontroll(kontrollPunktX, kontrollPunktY)<J6gi1.vaheptDistKontroll(kontrollPunktX, kontrollPunktY)){
            l2himJ6gi = J6gi2;
            l2bitudTee += J6gi3.vaheptDistKontroll(kontrollPunktX, kontrollPunktY)+J6gi2.vaheptDistKontroll(kontrollPunktX, kontrollPunktY);
        }else{
            l2himJ6gi = J6gi1;
            l2bitudTee += J6gi3.vaheptDistKontroll(kontrollPunktX, kontrollPunktY)+J6gi2.vaheptDistKontroll(kontrollPunktX, kontrollPunktY)+J6gi1.vaheptDistKontroll(kontrollPunktX, kontrollPunktY);
        }

        //System.out.println(l2himJ6gi.j6eInfo());
        System.out.println("Kaugus mereni: "+ l2bitudTee+"m");




        
    }
}