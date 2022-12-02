
public class Omregning {
	public static final double KURS = 7.5;
	
	public static double kronerTilEuro(double kroner) {
		return kroner / KURS;
	}
	
	public static double euroTilKroner(double euro) {
		return euro * KURS;
	}
}
