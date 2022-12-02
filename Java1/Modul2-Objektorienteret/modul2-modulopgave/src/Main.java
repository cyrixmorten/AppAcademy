
public class Main {

	public static void main(String[] args) {
		Bankkonto minKonto = new Bankkonto();
		minKonto.indsaetPenge(1000);
		minKonto.haevPenge(543);
		
		System.out.println("Saldoen er: " + minKonto.getSaldo());
	}

}
