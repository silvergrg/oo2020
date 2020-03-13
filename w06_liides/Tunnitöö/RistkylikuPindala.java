public class RistkylikuPindala implements Arvutatav{
	double laius;
	public RistkylikuPindala(double uusLaius){
		laius=uusLaius;
	}
	public double f(double pikkus){
		return pikkus*laius;
	}
}