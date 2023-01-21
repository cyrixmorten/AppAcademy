
public class Main {

	/*
	 * Viser hvordan kunder og medarbejdere kan holde data der er specifikke for dem, men at 
	 * de alle har navne eftersom de alle nedarver fra Person.
	 * 
	 */
	public static void main(String[] args) {

		Kunde kunde1 = new Kunde("Mark", 111);
		Kunde kunde2 = new Kunde("Tina", 222);
		Kunde kunde3 = new Kunde("Sofie", 333);
		
		Medarbejder medarbejder1 = new Medarbejder("Karsten", 123, Afregning.LØN_TYPE.MÅNEDSLØNNET);
		Medarbejder medarbejder2 = new Medarbejder("Mogens", 456, Afregning.LØN_TYPE.TIMELØNNET);
		Medarbejder medarbejder3 = new Medarbejder("Kirsten", 789, Afregning.LØN_TYPE.MÅNEDSLØNNET);
		
		// Kan få kunde-specifikke informationer fra kunderne
		kunde2.gennemFørBestilling();
		kunde2.gennemFørBestilling();
		kunde3.gennemFørBestilling();
		
		System.out.println("--Kunder--");
		System.out.println("Kunde1: " + kunde1.getKundeNummer() + ", Ordrer: " + kunde1.getAntalOrdrer());
		System.out.println("Kunde2: " + kunde2.getKundeNummer() + ", Ordrer: " + kunde2.getAntalOrdrer());
		System.out.println("Kunde3: " + kunde3.getKundeNummer() + ", Ordrer: " + kunde3.getAntalOrdrer());
		
		// Kan få medarbejder-specifikke informationer fra medarbejderne
		System.out.println("--Medarbejdere--");
		System.out.println("Medarbejder1: " + medarbejder1.getMedarbejderId() + ", Løntype: " + medarbejder1.getPrintableLønType());
		System.out.println("Medarbejder2: " + medarbejder2.getMedarbejderId() + ", Løntype: " + medarbejder2.getPrintableLønType());
		System.out.println("Medarbejder3: " + medarbejder3.getMedarbejderId() + ", Løntype: " + medarbejder3.getPrintableLønType());
		
		// Men eftersom både kunder og medarbejdere er personer, har de alle navne
		System.out.println("--Personer--");
		System.out.println("Kunde1: " + kunde1.getNavn());
		System.out.println("Kunde2: " + kunde2.getNavn());
		System.out.println("Kunde3: " + kunde3.getNavn());
		System.out.println("Medarbejder1: " + medarbejder1.getNavn());
		System.out.println("Medarbejder2: " + medarbejder2.getNavn());
		System.out.println("Medarbejder3: " + medarbejder3.getNavn());
	}

}
