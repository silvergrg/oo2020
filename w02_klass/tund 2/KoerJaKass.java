/**
 * KoerJaKass
 */
public class KoerJaKass {

    public static void main(String[] args) {
        Loom loom1 = new Loom(Liik.KOER, "Jack", Suurus.s, "Beagle");
        Loom loom2 = new Loom(Liik.KASS, "Felix", Suurus.l, "Bengal");
        Loom loom3 = new Loom(Liik.MUU, "Yoshi", Suurus.m, "Dinosaurus");

        Loom[] loomad = {loom1, loom2, loom3};
        for(int i = 0; i < loomad.length; i++){
            System.out.println(loomad[i].getNimi());
            System.out.println(loomad[i].getSuurus());
            System.out.println(loomad[i].getTõug());
            loomad[i].loomAction(loomad[i]);
        }
    }
}