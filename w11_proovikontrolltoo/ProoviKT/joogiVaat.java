public class joogiVaat {
    double ruumala;
    double sisuKogus;
    jook sisu;

    public joogiVaat(jook usisu, double uruumala, double usisuKogus){
        sisu = usisu;
        ruumala = uruumala;
        sisuKogus = usisuKogus;
    }

    public void t2ida(joogipudel pudel){
        if(pudel.kysiSisu()==null){
            if(pudel.kysiMaht() <= sisuKogus){
                pudel.uusSisu(sisu);
                sisuKogus -= pudel.kysiMaht();
            }
        }
    }

    public void villimine(joogipudel[] pudelid){
        for(int i=0; i<pudelid.length; i++){
            t2ida(pudelid[i]);
        }
    }

}