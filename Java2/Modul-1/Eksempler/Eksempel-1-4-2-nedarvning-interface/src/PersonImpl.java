public class PersonImpl implements Person {

	private String navn;

	PersonImpl(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	

}

