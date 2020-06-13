public class joogipudel {
    double maht;
    double mass;
    double taara;
    pudeliTyyp tyyp;
    jook sisu;

    public String tyybiNimi(){
        String ret;
        switch(tyyp){
            case KLAAS:
                ret = "klaas";
                break;
            case PLASTIK:
                ret = "plastik";
                break;
            default:
                ret = "teadmata";
                break;
        }

        return ret;
    }

    public joogipudel(double umaht, double umass, double utaarahind, pudeliTyyp utyyp, jook usisu){
        maht = umaht;
        mass = umass;
        taara = utaarahind;
        tyyp = utyyp;
        sisu = usisu;
    }

    public String toString(){
        return "Sisu: " +sisu+ " taara tüüp: "+ tyybiNimi()+ " pudeli mass: " +mass+ "taara hind: " +taara+ "eur";
    }

    public double kysiMass(){
        if(sisu==null){
            return mass;
        }else{
        return mass + maht*sisu.kysiErikaal();
        }
    }

    public double kysiHind(){
        if(sisu==null){
            return taara;
        }else{
        return taara + maht*sisu.kysiOmahind();
        }
    }

    public double kysiMaht(){
        return maht;
    }

    public jook kysiSisu(){
        return sisu;
    }

    public void uusSisu(jook j){
        sisu = j;
    }  
    
   

}