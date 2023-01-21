
public class Skoda extends Bil {

	public Skoda(String modelNavn, int vægtKg, int brændstofType) {
		super("Skoda", modelNavn, vægtKg, brændstofType);
	}

	@Override
	public double udledningGramPerKm() {
		int benzin = 1;
		int diesel = 2;
		
		int gennemSnitsUdledning = 999;
		if (getBrændstofType() == benzin) {
			gennemSnitsUdledning = 115; 
		} else if (getBrændstofType() == diesel) {
			gennemSnitsUdledning = 130;
		} 
		
		double vægtFaktor = getVægtKg() * 0.03;
		
		return gennemSnitsUdledning + vægtFaktor;
	}

}
