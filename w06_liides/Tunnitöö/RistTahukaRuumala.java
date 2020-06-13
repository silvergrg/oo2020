public class RistTahukaRuumala implements Arvutatav2{
    double laius;
    double pikkus;
	public RistTahukaRuumala(double uusLaius, double uusPikkus){
        laius=uusLaius;
        pikkus=uusPikkus;
	}
	public double f(double k6rgus){
		return pikkus*laius*k6rgus;
	}
	public double D(double k6rgus){
		return Math.sqrt(Math.pow(laius, 2) + Math.pow(pikkus, 2) + Math.pow(k6rgus, 2));
	}
}