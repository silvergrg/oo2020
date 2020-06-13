public class Proov1 {
    
    public static void main(String[] args) {
        PunktiMassiPaar paar1 = new PunktiMassiPaar(new Punktmass1_klass(5, 3), new Punktmass1_klass(2, 10));
        //System.out.println(paar1.massikeseX());
        PunktiMassiPaar paar2 = new PunktiMassiPaar(paar1, new Punktmass1_klass(10, 15));
        //System.out.println(paar2.massikeseX());
        System.out.println(paar2.tekstina());
    }
}