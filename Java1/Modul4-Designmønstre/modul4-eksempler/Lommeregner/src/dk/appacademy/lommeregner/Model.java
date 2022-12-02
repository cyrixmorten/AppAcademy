package dk.appacademy.lommeregner;

public class Model {
	private int resultat;
	
	public void plus(int tal) {
		resultat += tal;
	}
	
	public void minus (int tal) {
		resultat -= tal;
	}

	public int getResultat() {
		return resultat;
	}
}
