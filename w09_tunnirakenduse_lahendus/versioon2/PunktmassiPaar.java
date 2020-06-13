import java.awt.Graphics;

public class PunktmassiPaar extends AbstraktnePunktmass{
    AbstraktnePunktmass p1, p2;

    public PunktmassiPaar(AbstraktnePunktmass up1, AbstraktnePunktmass up2){
        p1 = up1;
        p2 = up2;
    }

    public double kysiKg(){
        return p1.kysiKg() + p2.kysiKg();
    }

    double jouMoment(double x, AbstraktnePunktmass p){
        return Math.abs((x-p.massikeseX())*p.kysiKg());
    }

    public String tekstina(int sygavus){
        return p1.tekstina(sygavus+1) + "\n" + 
        super.tekstina(sygavus)+"\n"+ p2.tekstina(sygavus+1);
    }

    public void joonista(Graphics g, int sygavus){
        p1.joonista(g, sygavus+1);
        super.joonista(g, sygavus);
        g.drawLine((int)(p1.massikeseX()*KOEFX), (int)(SYGAVUSPX*(sygavus+1)),(int)(p2.massikeseX()*KOEFX), (int)(SYGAVUSPX*(sygavus+1)));
        g.drawLine((int)(p1.massikeseX()*KOEFX), (int)(SYGAVUSPX*(sygavus+1)),(int)(p1.massikeseX()*KOEFX), (int)(SYGAVUSPX*(sygavus+2)));
        g.drawLine((int)(p2.massikeseX()*KOEFX), (int)(SYGAVUSPX*(sygavus+1)),(int)(p2.massikeseX()*KOEFX), (int)(SYGAVUSPX*(sygavus+2)));
        p2.joonista(g, sygavus+1);
    }

    public double massikeseX(){
        double tempX = p1.massikeseX();
        double samm = p2.massikeseX();
        double moment1 = jouMoment(tempX, p1);
        double moment2 = jouMoment(tempX, p2);

        while(Math.abs(moment2-moment1)>0.01){
            samm/=2;
            if(moment1<moment2){
                tempX+=samm;
            }else{
                tempX-=samm;
            }
            moment1 = jouMoment(tempX, p1);
            moment2 = jouMoment(tempX, p2);
        }
        return tempX;
    }
}