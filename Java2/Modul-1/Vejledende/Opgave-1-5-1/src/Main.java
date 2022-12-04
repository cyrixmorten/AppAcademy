import java.util.Arrays;
import java.util.List;

public class Main {


	/*
	 * Både Hund og Kat implementerer deres egen version af givLyd() 
	 * 
	 */
	public static void main(String[] args) {
		
		Hund king = new Hund("King", false, false);
		Hund plet = new Hund("Plet", false, true);
		Hund lassie = new Hund("Lassie", true, true);
		Kat kisser = new Kat("Kisser", true, true);
		Kat pjevs = new Kat("Pjevs", false, true);

		
		List<Kaeledyr> alleDyr = Arrays.asList(king, plet, lassie, kisser, pjevs);
		
		for (Kaeledyr dyr: alleDyr) {
			System.out.println(dyr.getNavn() + ":");
			dyr.givLyd();
			System.out.println();
		}
	}

}
