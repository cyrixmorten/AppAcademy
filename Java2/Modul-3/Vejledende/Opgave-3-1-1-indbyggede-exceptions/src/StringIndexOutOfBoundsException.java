
public class StringIndexOutOfBoundsException {

	public static void main(String[] args) {

		String tekst = "Hello World";
		
		/*
		 * Her printes hvert bostav på en ny linje, men fordi variablen i tælles op 
		 * mens den er mindre end eller lig med længden på strengen, så vil den i sidste
		 * iteration forsøge at slå bogstav på index 12 op.
		 * 
		 * Fejlen her er lighedstegnet i
		 */
		for (int i = 0; i <= tekst.length(); i++) {
			System.out.println(tekst.charAt(i));
		}

	}

}
