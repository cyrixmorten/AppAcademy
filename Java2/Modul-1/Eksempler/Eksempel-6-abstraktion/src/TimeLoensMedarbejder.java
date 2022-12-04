
public class TimeLoensMedarbejder extends Medarbejder {

	private int antalTimer = 0;
	private double timeLøn;
	
	TimeLoensMedarbejder(String navn, int medarbejderId, double timeLøn) {
		super(navn, medarbejderId);
		this.timeLøn = timeLøn;
	}
	
	
	public int getAntalTimer() {
		return antalTimer;
	}

	public void setAntalTimer(int antalTimer) {
		this.antalTimer = antalTimer;
	}
	
	@Override
	public double beregnLøn() {
		return timeLøn * antalTimer;
	}

}
