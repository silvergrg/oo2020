import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;
public class TekstiTestid{
	TekstiUurija t;
	@Test
	public void pikkus(){
		assertEquals(7, t.t2htedeArv("telefon"));
	}
	@Test
	public void loendamine1(){
		assertEquals(2, t.loenda("tere", 'e'));
		assertEquals(3, t.loenda("terekest", 'e'));
	}
	public void looTervitavFail(){
		try{
			PrintWriter pw=new PrintWriter(new FileWriter("tervitus.txt"));
			pw.println("tere tulemast");
			pw.close();
		} catch(Exception e){e.printStackTrace();}
	}
	@Test
	public void sonadFailist(){
		looTervitavFail();
		t.loeFailist("tervitus.txt");
		assertEquals(2, t.sonadeArv()); 
	}
}
