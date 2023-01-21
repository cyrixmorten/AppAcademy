
public class Main {


	public static void main(String[] args) {
		
		By by = new By();
		by.setNavn("Aarhus");
		by.setPostNummer(8000);
		
		System.out.println("Navn: " + by.getNavn());
		System.out.println("Postnummer: " + by.getPostNummer());
	}

}
