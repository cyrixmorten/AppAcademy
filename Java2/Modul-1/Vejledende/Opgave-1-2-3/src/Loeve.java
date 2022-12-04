
public class Loeve {

	private String navn;
	private boolean erSulten;
	private boolean erTraet;
	
	public Loeve(String navn, boolean erSulten, boolean erTraet) {
		this.navn = navn;
		this.erSulten = erSulten;
		this.erTraet = erTraet;
	}
	

	public void printHumør() {
		String humør = "";
		if (this.erSulten) {
			humør = "Er sulten";
		} else {
			humør = "Er ikke sulten";
		}
		
		if (this.erTraet) {
			humør += " og træt";
		} else {
			humør += " og ikke træt";
		}
		
		if (this.erSulten && this.erTraet) {
			humør += " WraaWWWww";
		}
		
		System.out.println(this.navn + ": " + humør);
	}
}
