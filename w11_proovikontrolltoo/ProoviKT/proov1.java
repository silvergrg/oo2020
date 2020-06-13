/**
 * proov1
 */
public class proov1 {

    public static void main(String[] args) {
        jook j1 = new jook("piim", 0.28, 1.05);
        System.out.println(j1.kysiNimetus());
        joogipudel p1 = new joogipudel(0.5, 0.2, 0.1, pudeliTyyp.KLAAS, j1);
        System.out.println(p1);
        System.out.println(p1.kysiMass());
        System.out.println(p1.kysiHind());
        joogipudel p2 = new joogipudel(0.5, 0.05, 0.1, pudeliTyyp.PLASTIK, null);
        System.out.println(p2);
        System.out.println(p2.kysiMass());
        System.out.println(p2.kysiHind());
    }
}