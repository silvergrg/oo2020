/**
 * jook
 */
public class jook {
    String nimetus;
    double omahind;
    double erikaal;
    
    public jook(String unimetus, double uomahind, double uerikaal){
        nimetus = unimetus;
        omahind = uomahind;
        erikaal = uerikaal;
    }

    public String kysiNimetus(){
        return nimetus;
    }

    public double kysiOmahind(){
        return omahind;
    }

    public double kysiErikaal(){
        return erikaal;
    }

    public String toString(){
        return nimetus + " " + omahind + " eur/l " + erikaal + " kg/l ";
    }
}