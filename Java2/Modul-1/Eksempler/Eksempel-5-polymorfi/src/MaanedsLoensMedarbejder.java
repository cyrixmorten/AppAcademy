
public class MaanedsLoensMedarbejder extends Medarbejder {

	private double månedsLøn;
	
	MaanedsLoensMedarbejder(String navn, int medarbejderId, double månedsLøn) {
		super(navn, medarbejderId);
		this.månedsLøn = månedsLøn;
	}
	
	@Override
	public double beregnLøn() {
		return månedsLøn;
	}

}
