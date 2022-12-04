
public class Main {

	/*
	 * Viser hvordan kunder og medarbejdere kan holde data der er specifikke for dem, men at 
	 * de alle har navne eftersom de alle nedarver fra Person.
	 * 
	 * I modsætning til Eksempel4, så foregår nedarvningen her via interfaces, altså kontrakter som klassen der 
	 * implementerer interfacet skal overholde. 
	 * 
	 * Selvom det måske virker lidt mere kompliseret end nedarvning via klasser, så har nogle fordele at bruge denne tilgang. 
	 * 
	 * En klasse kan nedarve fra mere end ét interface. Både KundeImpl og MedarbejderImpl nedarver fra to interfaces.
	 * 
	 * Koden bliver mere afkoblet. Vi kunne eksemeplvis sagtens lave en alternativ version af Person, så længe 
	 * den overholder kontrakten kan den bruges. Dette er demonstreret med PersonMedTitelImpl, der tilføjer en titel til personen.
	 * 
	 */
	public static void main(String[] args) {

		Person person1 = new PersonImpl("Mark");
		Person person2 = new PersonImpl("Tina");
		Person person3 = new PersonImpl("Sofie");
		Person person4 = new PersonImpl("Karsten");
		Person person5 = new PersonMedTitelImpl("Mogens", "Hr");
		Person person6 = new PersonMedTitelImpl("Kirsten", "Fru");
		
		Kunde kunde1 = new KundeImpl(person1, 111);
		Kunde kunde2 = new KundeImpl(person2, 222);
		Kunde kunde3 = new KundeImpl(person3, 333);
		
		Medarbejder medarbejder1 = new MedarbejderImpl(person4, 123, Afregning.LØN_TYPE.MÅNEDSLØNNET);
		Medarbejder medarbejder2 = new MedarbejderImpl(person5, 456, Afregning.LØN_TYPE.TIMELØNNET);
		Medarbejder medarbejder3 = new MedarbejderImpl(person6, 789, Afregning.LØN_TYPE.MÅNEDSLØNNET);
		
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
