
public class Volvo extends Bil {

	public Volvo(String modelNavn, int vægtKg, int brændstofType) {
		super("Volvo", modelNavn, vægtKg, brændstofType);
	}

	@Override
	public double udledningGramPerKm() {
		int benzin = 1;
		int diesel = 2;
		
		int gennemSnitsUdledning = 999;
		if (getBrændstofType() == benzin) {
			gennemSnitsUdledning = 125; 
		} else if (getBrændstofType() == diesel) {
			gennemSnitsUdledning = 150;
		} 
		
		double vægtFaktor = getVægtKg() * 0.05;
		
		return gennemSnitsUdledning + vægtFaktor;
	}

}
