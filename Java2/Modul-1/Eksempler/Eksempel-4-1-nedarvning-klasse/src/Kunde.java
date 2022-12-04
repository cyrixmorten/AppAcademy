/*
 * En kunde er en lidt mere specifik person. 
 * 
 * Her siger vi at kunden tildeles et kundenummer, og vi holder øje med hvor 
 * mange ordrer kunden har gennemført. 
 * 
 * Hverken kundenummer eller antalOrdrer har Setters idet de ikke er tiltænkt at kunne overskrives. 
 */
public class Kunde extends Person {

	private int antalOrdrer = 0;
	private int kundeNummer;

	Kunde(String navn, int kundeNummer) {
		super(navn); // Sætter navn på Person klassen
		this.kundeNummer = kundeNummer;
	}
	
	public int getKundeNummer() {
		return kundeNummer;
	}

	public int getAntalOrdrer() {
		return antalOrdrer;
	}
	
	public void gennemFørBestilling() {
		antalOrdrer += 1;
	}
}
