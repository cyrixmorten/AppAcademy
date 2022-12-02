
public class Kunde {
	public static int naesteKunde = 1;
	
	public int kundeNummer;
	
	public Kunde() {
		kundeNummer = naesteKunde;
		naesteKunde++;
	}
	
	public int getKundeNummer() {
		return kundeNummer;
	}
}
