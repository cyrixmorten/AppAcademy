
public class LommeRegner {

	public double divider(double a, double b) {
		if (b == 0) {
			throw new DivideringMedNulException();
		}
		return a/b;
	}

}

