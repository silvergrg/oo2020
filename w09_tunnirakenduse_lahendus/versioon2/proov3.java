public class proov3 {
    public static void main(String[] args) {
        PunktmassiPaar paar1 = new PunktmassiPaar(new Punktmass(5, 2), new Punktmass(2, 10));
        PunktmassiPaar paar2 = new PunktmassiPaar(paar1, new Punktmass(10, 15));

        System.out.println(paar2.tekstina(0));
    }
    
    
}