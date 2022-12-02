
public class TestMain {

	public static void main(String[] args) {
		Firkant minFirkant = new Firkant(7, 5);
		Cirkel minCirkel = new Cirkel(3);
		
		minFirkant.printAreal();
		minCirkel.printAreal();
		
		Figur[] figurListe = new Figur[4];
		figurListe[0] = new Firkant(3, 2);
		figurListe[1] = new Firkant(5, 3);
		figurListe[2] = new Cirkel(7);
		figurListe[3] = new Cirkel(3);
		
		for (Figur figur : figurListe) {
			figur.printAreal();
		}
		
	}

}
