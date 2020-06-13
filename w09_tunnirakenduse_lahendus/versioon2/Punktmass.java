class Punktmass extends AbstraktnePunktmass{
    double kg, x;
    public Punktmass(double kg, double x){
        this.kg = kg;
        this.x = x;
    }
    public double massikeseX(){
        return x;        
    }
    public double kysiKg(){
        return kg;
    }
}