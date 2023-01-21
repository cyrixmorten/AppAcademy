
public class LommeRegner {

	public double divider(double a, double b) throws DivideringMedNulException {
		if (b == 0) {
			throw new DivideringMedNulException();
		}
		return a/b;
	}

}

