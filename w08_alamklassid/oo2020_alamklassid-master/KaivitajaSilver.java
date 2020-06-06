
public class KaivitajaSilver{
	public static void main(String[] arg) throws Exception{
        if(arg.length==2){
 		  TekstiUurija t=(TekstiUurija)Class.forName(arg[0]).newInstance();
		  System.out.println(t.t2htedeArv(arg[1]));
		}
	}
}