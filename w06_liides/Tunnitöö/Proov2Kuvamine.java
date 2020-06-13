public class Proov2Kuvamine{
	public static void kuva(Arvutatav2 a){
		for(int i=1; i<=5; i++){
			System.out.print(a.f(i)+" "); 	//Ruumala
			System.out.println(a.D(i)+" "); //Diagonaali pikkus
		}
		System.out.println();
	}
	public static void main(String[] arg){
        //kuva(new RistkylikuPindala(5));
		//kuva(new RistTahukaRuumala(5,16));
		//kuva(new RistTahukaRuumala(1,1));
		kuva(new RistTahukaRuumala(2,2));
	}
}