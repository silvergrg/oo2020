public class PunktiMassiPaar implements Punktmass1{
    Punktmass1 p1, p2;

    public PunktiMassiPaar(Punktmass1 up1, Punktmass1 up2) {
        p1 = up1;
        p2 = up2;
    }

    public double kysiKg(){
        return p1.kysiKg() + p2.kysiKg();
    }

    double jouMoment(double x, Punktmass1 p){
        return Math.abs((x - p.massikeseX())* p.kysiKg());
    }

    public String tekstina(){
        return p1.tekstina()+ " " +massikeseX()+ " " +kysiKg()+ " kg " + p2.tekstina();
    }

    public double massikeseX(){
        double tempX=p1.massikeseX();
        double samm = p2.massikeseX() - tempX;
        double moment1 = jouMoment(tempX, p1);
        double moment2 = jouMoment(tempX, p2);
        while(Math.abs(moment2-moment1)>0.01){
            samm/=2;
            if(moment1<moment2){
                tempX+=samm;
            }else{
                tempX-=samm;
            }
            moment1=jouMoment(tempX, p1);
            moment2=jouMoment(tempX, p2);
        }
        return tempX;
    }
    
}
/*
  x=3 5kg
  x=10 2kg
  
  x=(10+3)/2 = 6,5
  (6,5-3)*5=17,5 N*m
  (10-6,5)*2=7 N*m
   kuna 17,5>7
    x=(6,5+3)/2 = 4,5
    arvutan jõumomendid
    jätkan, kuni kahe jõumomendi vahe on väiksem kui 0.01 N*m
*/