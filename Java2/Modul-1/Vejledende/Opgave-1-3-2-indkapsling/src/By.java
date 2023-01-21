
public class By {

	private String navn;
	private int postNummer;
      
    By(String navn, int postNummer) {
    	this.navn = navn;
    	this.postNummer = postNummer;
    }


	public void print() {
		System.out.println("Navn: " + navn);
		System.out.println("Postnummer: " + postNummer);
	}
}

