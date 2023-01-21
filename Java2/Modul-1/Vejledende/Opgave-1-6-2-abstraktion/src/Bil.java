
public abstract class Bil {

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


	public abstract double udledningGramPerKm();
}
