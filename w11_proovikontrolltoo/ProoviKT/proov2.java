public class proov2 {
    public static void main(String[] args) {
        joogiVaat v1 = new joogiVaat(new jook("limonaad", 0.2, 1.1), 50, 15);
        System.out.println(v1);
        joogipudel p1 = new joogipudel(1.5, 0.07, 0.1, pudeliTyyp.PLASTIK, null);
        System.out.println(p1);
        v1.t2ida(p1);
        System.out.println(v1);
        System.out.println(p1);

        joogipudel[] pd = new joogipudel[10];
        for(int i=0; i<pd.length; i++){
            pd[i]=new joogipudel(1.5, 0.07, 0.1, pudeliTyyp.PLASTIK, null);
        }
        for(int i=0; i<pd.length; i++){
            v1.t2ida(pd[i]);
            System.out.println(pd[i]);
        }
        System.out.println(v1);
    }
    
}