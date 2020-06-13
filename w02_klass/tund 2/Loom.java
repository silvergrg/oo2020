/**
 * Koer
 */
public class Loom {

    private Liik liik;
    private String nimi;
    private Suurus suurus;
    private String tõug;


    public Loom(Liik liik, String nimi, Suurus suurus, String tõug){
        this.liik = liik;
        this.nimi = nimi;
        this.suurus = suurus;
        this.tõug = tõug;
    }

    public String getNimi(){
        return nimi;
    }

    public String getSuurus(){
        if(suurus == Suurus.s){
            if(liik == Liik.KOER){
                return "Väike koer";
            }else if(liik == Liik.KASS){
                return "Väike kass";
            }else{
                return "Väike loom";
            }
        }else if(suurus == Suurus.m){
            if(liik == Liik.KOER){
                return "Keskmine koer";
            }else if(liik == Liik.KASS){
                return "Keskmine kass";
            }else{
                return "Keskmine loom";
            }
        }else{
            if(liik == Liik.KOER){
                return "Suur koer";
            }else if(liik == Liik.KASS){
                return "Suur kass";
            }else{
                return "Suur loom";
            }
        }
    }

    public String getTõug(){
        return tõug;
    }

    public void loomAction(Loom loom){
        if(liik == Liik.KOER){
            System.out.println(loom.getNimi() + " ütleb Auh auh!");
        }else if(liik == Liik.KASS){
            System.out.println(loom.getNimi() + " ütleb Mjäu!");
        }else{
            System.out.println("Mis häält " + loom.getNimi() + " teeb?");
        }
        
    }
}