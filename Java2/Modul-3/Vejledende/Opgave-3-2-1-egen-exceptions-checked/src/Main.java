
public class Main {

	public static void main(String[] args) {
		LommeRegner minLommeRegner = new LommeRegner();
		

		double talPaaDisplay = 10;

		// fejler men programmet fortsætter og der står stadig 10
		// på lommeregnerens display
		dividerKnap(minLommeRegner, talPaaDisplay, 0);
		// brugeren prøver at dividere med 2 i stedet
		dividerKnap(minLommeRegner, talPaaDisplay, 2);
	
	}
	
	private static void dividerKnap(LommeRegner lommeregner, double a, double b) {
		try {
			System.out.println(lommeregner.divider(a, b));
		} catch (DivideringMedNulException e) {
			System.out.println("Du må ikke dividere med 0 - prøv igen");
		}
	}

}
