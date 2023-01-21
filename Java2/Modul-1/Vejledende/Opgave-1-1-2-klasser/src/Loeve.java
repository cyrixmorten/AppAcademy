
public class Loeve {

	private String navn;
	private boolean erSulten;
	
	public Loeve(String navn, boolean erSulten) {
		this.navn = navn;
		this.erSulten = erSulten;
	}
	

	public void printHumør() {
		String humør = "";
		if (this.erSulten) {
			humør = "Er sulten";
		} else {
			humør = "Er ikke sulten";
		}
		System.out.println(this.navn + ": " + humør);
	}
}
