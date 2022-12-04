
public class Main {

	/*
	 * Her har vi tre løver med forskellige navne.
	 * 
	 * De har alle sammen tilfælles at de er løver, men fordi de hver 
	 * især er sin egen instans af klassen Loeve, kan der være forskel på hvad de hedder
	 * og hvorvidt de er sultne eller ej. 
	 */
	public static void main(String[] args) {
		
		Loeve jan = new Loeve("Jan", false);
		Loeve mark = new Loeve("Mark", true);
		Loeve simba = new Loeve("Simba", false);
		
		jan.printHumør();
		mark.printHumør();
		simba.printHumør();
	}

}
