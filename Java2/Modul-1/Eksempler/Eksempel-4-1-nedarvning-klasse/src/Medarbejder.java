/*
 * En medarbejder er en lidt mere specifik person. 
 * 
 * Her siger vi at medarbejder tildeles et medarbejderId, og hvilken lønType medarbejderen modtager. 
 * 
 * Hverken medarbejderId eller lønType har Setters idet de ikke er tiltænkt at kunne overskrives. 
 */

public class Medarbejder extends Person {	
	
	private int medarbejderId;
	private Afregning.LØN_TYPE lønType; 
	
	Medarbejder(String navn, int medarbejderId, Afregning.LØN_TYPE lønType) {
		super(navn); // Sætter navn på Person klassen
		this.medarbejderId = medarbejderId;
		this.lønType = lønType;
	}


	public int getMedarbejderId() {
		return medarbejderId;
	}
	
	public Afregning.LØN_TYPE getLønType() {
		return lønType;
	}

	public String getPrintableLønType() {
		switch (lønType) {
			case MÅNEDSLØNNET: {
				return "Måneslønnet";
			}
			case TIMELØNNET: {
				return "Timelønnet";
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + lønType);
			}
	}

}
