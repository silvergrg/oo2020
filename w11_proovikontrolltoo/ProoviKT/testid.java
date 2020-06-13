import org.junit.*;
import static org.junit.Assert.*;

public class testid {
    @Test
    public void nimetus(){
        jook j=new jook("limonaad", 0.2, 1.1);
        assertEquals("limonaad", j.kysiNimetus());
    }

    @Test
    public void mass2(){
        jook j1 = new jook("piim", 0.28, 1.05);
        joogipudel p1= new joogipudel(0.5, 0.2, 0.1, pudeliTyyp.KLAAS, j1);
        assertEquals(0.725, p1.kysiHind(), 0.01);
    }

    @Test
    public void hind1(){
        jook j1= new jook("piim", 0.28, 1.05);
        joogipudel p1 = new joogipudel(0.5, 0.02, 0.01, pudeliTyyp.PLASTIK, j1);
        assertEquals(0.24, p1.kysiHind(), 0.01);
    }

    @Test
    public void vaat1(){
        joogiVaat v1 = new joogiVaat(new jook("limonaad", 0.2, 1.1), 50, 15);
        joogipudel[] pd = new joogipudel[10];
        for(int i=0; i<pd.length; i++){
            pd[i]=new joogipudel(1.5, 0.07, 0.1, pudeliTyyp.PLASTIK, null);
        }
        for(int i=0; i<pd.length; i++){
            v1.t2ida(pd[i]);
            System.out.println(pd[i]);
        }
        assertEquals(0, v1.kysiSisuKogus(), 0.01);
    }

    
}