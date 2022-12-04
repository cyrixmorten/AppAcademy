/*
 * En kunde er en lidt mere specifik person. 
 * 
 * Her siger vi at kunden tildeles et kundenummer, og vi holder øje med hvor 
 * mange ordrer kunden har gennemført. 
 * 
 * Hverken kundenummer eller antalOrdrer har Setters idet de ikke er tiltænkt at kunne overskrives. 
 */
public class KundeImpl implements Kunde {

	private int antalOrdrer = 0;
	private int kundeNummer;
	private Person person;

	KundeImpl(Person person, int kundeNummer) {
		this.person = person;
		this.kundeNummer = kundeNummer;
	}
	
	@Override
	public int getKundeNummer() {
		return kundeNummer;
	}
	
	@Override
	public int getAntalOrdrer() {
		return antalOrdrer;
	}
	
	@Override
	public void gennemFørBestilling() {
		antalOrdrer += 1;
	}
	
	@Override
	public String getNavn() {
		return person.getNavn();
	}


	@Override
	public void setNavn(String navn) {
		person.setNavn(navn);
	}
}
