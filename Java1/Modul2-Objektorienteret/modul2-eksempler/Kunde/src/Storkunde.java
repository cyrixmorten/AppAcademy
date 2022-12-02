
public class Storkunde extends Kunde {
	public double getSaldo(double[] priser) {
		double saldo = super.getSaldo(priser);
		saldo = saldo * 0.9;
		return saldo;
	}
}
