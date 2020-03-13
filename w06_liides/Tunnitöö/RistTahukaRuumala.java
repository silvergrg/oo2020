public class RistTahukaRuumala implements Arvutatav{
    double laius;
    double pikkus;
	public RistTahukaRuumala(double uusLaius, double uusPikkus){
        laius=uusLaius;
        pikkus=uusPikkus;
	}
	public double f(double k6rgus){
		return pikkus*laius*k6rgus;
	}
}