
public class Kunde {
	public double getSaldo(double[] priser) {
		double saldo = 0;
		for (double d : priser) {
			saldo += d;
		}
		return saldo;
	}
	
	public double getSaldo(int[] antal, double[] priser) {
		return 0;
	}
}
