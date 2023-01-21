
public class Bil {

	private String producentNavn;
	private String modelNavn;
	private int vægtKg;
	private int brændstofType;
	
	public Bil(String producentNavn, String modelNavn, int vægtKg, int brændstofType) {
		super();
		this.producentNavn = producentNavn;
		this.modelNavn = modelNavn;
		this.vægtKg = vægtKg;
		this.brændstofType = brændstofType;
	}
	
	
	
	public String getProducentNavn() {
		return producentNavn;
	}

	public String getModelNavn() {
		return modelNavn;
	}

	public int getVægtKg() {
		return vægtKg;
	}


	public int getBrændstofType() {
		return brændstofType;
	}


	public double udledningGramPerKm() {
		int benzin = 1;
		int diesel = 2;
		int el = 3;
		
		int gennemSnitsUdledning = 999;
		if (brændstofType == benzin) {
			gennemSnitsUdledning = 125; 
		} else if (brændstofType == diesel) {
			gennemSnitsUdledning = 150;
		} else if (brændstofType == el) {
			gennemSnitsUdledning = 25;
		}
		
		double vægtFaktor = vægtKg * 0.05;
		
		return gennemSnitsUdledning + vægtFaktor;
	}
}
