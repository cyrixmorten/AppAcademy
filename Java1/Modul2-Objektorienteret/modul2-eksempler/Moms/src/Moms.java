
public class Moms {
	public static final double MOMS_RATE = 1.25;
	
	public static double tilfoejMoms(double belob) {
		return belob * MOMS_RATE;
	}
	
	public static double fjenMoms(double belob) {
		return belob / MOMS_RATE;
	}
}
