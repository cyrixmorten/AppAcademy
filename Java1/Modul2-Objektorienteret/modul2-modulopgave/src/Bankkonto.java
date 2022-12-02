
public class Bankkonto {
	private double saldo;
	
	public Bankkonto() {
		saldo = 500;
	}
	
	public void indsaetPenge(double belob) {
		saldo += belob;
	}
	
	public void haevPenge(double belob) {
		if (belob <= saldo) {
			saldo -= belob;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
}
