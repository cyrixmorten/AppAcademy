
public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 10;  i++) {
			Kunde kunde = new Kunde();
			System.out.println("Kundenr: " + kunde.getKundeNummer());
		}
	}
}
