
public class Tesla extends Bil {

	public Tesla(String modelNavn, int vægtKg, int brændstofType) {
		super("Tesla", modelNavn, vægtKg, brændstofType);
	}

	@Override
	public double udledningGramPerKm() {
		return 0;
	}

}
