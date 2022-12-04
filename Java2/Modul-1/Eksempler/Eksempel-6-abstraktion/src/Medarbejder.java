
public abstract class Medarbejder extends Person {	
	
	private int medarbejderId;

	
	Medarbejder(String navn, int medarbejderId) {
		super(navn); // Sætter navn på Person klassen
		this.medarbejderId = medarbejderId;
	}


	public int getMedarbejderId() {
		return medarbejderId;
	}
	
	abstract double beregnLøn();
}
