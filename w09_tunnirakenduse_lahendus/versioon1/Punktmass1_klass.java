public class Punktmass1_klass implements Punktmass1{
    double kg;
    double x;

    public Punktmass1_klass(double kg, double x){
        this.kg = kg;
        this.x = x;
    }

    public double massikeseX(){
        return x;
    }

    public double kysiKg(){
        return kg;
    }

    public String tekstina(){
        return x + " " +kysiKg()+ "kg";
    }
    
}