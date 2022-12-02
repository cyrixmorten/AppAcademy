package dk.kortspil;

public class Kort {
	public enum KortKulor { spar, hjerter, klor, ruder };
	private KortKulor kulor;
	private int vaerdi;
	
	public Kort(KortKulor kulor, int vaerdi) {
		super();
		this.kulor = kulor;
		this.vaerdi = vaerdi;
	}
	public KortKulor getKulor() {
		return kulor;
	}
	public void setKulor(KortKulor kulor) {
		this.kulor = kulor;
	}
	public int getVaerdi() {
		return vaerdi;
	}
	public void setVaerdi(int vaerdi) {
		this.vaerdi = vaerdi;
	}
	
	
}
