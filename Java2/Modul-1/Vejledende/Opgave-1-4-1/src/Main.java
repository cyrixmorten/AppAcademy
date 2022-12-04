
public class Main {


	public static void main(String[] args) {
		
		Hund hund = new Hund("King");
		Kat kat = new Kat("Kisser");
		
		System.out.println(hund.getNavn());
		hund.setSulten(false);
		hund.setVågen(true);
		hund.sigVov(); // siger ikke noget
		hund.setSulten(true);
		hund.sigVov(); // siger vov
		
		System.out.println(kat.getNavn());
		kat.setSulten(true);
		kat.setVågen(true);		
		kat.sigMiav(); // siger miav
	}

}
