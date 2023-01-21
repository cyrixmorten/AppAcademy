
public class PrivateBy {

	private int postNummer;
	private String byNavn;

	public PrivateBy(int postNummer) {
		this.postNummer = postNummer;
		this.hentByNavn();
	}
	
	private void hentByNavn() {
		if (postNummer >= 1000 && postNummer <= 2000) {
			this.byNavn = "København";
		} else if (postNummer >= 5000 && postNummer <= 6000) {
			this.byNavn = "Odense";
		} else if (postNummer >= 8000 && postNummer <= 9000) {
			this.byNavn = "Århus";
		} else {
			this.byNavn = "Andet";
		}
	}
	
	public int getPostNummer() {
		return postNummer;
	}

	public String getByNavn() {
		return byNavn;
	}
}
	

