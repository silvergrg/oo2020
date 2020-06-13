import java.awt.Graphics;

abstract class AbstraktnePunktmass {
    final int SYGAVUSPX = 20;
    final int KOEFX = 25;
    abstract double massikeseX();
    abstract double kysiKg();
    String tekstina(int sygavus){
        StringBuffer sb=new StringBuffer();
        for(int i=0; i<sygavus; i++){
            sb.append(" ");
        }
        sb.append(ymarda(massikeseX()) + " " + kysiKg()+ " kg");
        return sb.toString();
    }

    double ymarda(double arv){
        return Math.round(arv*10)/10.0;
    }

    void joonista(Graphics g, int sygavus){
        g.drawString(kysiKg()+ "", (int)(KOEFX*massikeseX()), SYGAVUSPX*(sygavus+1));
    }
}