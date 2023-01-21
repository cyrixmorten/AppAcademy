
public class PersonMedTitelImpl implements Person {

	private String titel;
	private String navn;

	PersonMedTitelImpl(String navn, String titel) {
		this.navn = navn;
		this.titel = titel;
	}
	
	public String getNavn() {
		return titel + " " + navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	

}

