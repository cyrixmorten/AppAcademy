
public class Kaeledyr extends Dyr {

	private String navn;
	
	public Kaeledyr(String navn, boolean vågen, boolean sulten) {
		super(vågen, sulten);
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	

}
