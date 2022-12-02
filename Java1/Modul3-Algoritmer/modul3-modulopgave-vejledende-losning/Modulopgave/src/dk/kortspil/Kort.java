package dk.kortspil;

public class Kort {
	private String kulor;
	private int vaerdi;
	
	public Kort(String kulor, int vaerdi) {
		super();
		this.kulor = kulor;
		this.vaerdi = vaerdi;
	}
	public String getKulor() {
		return kulor;
	}
	public void setKulor(String kulor) {
		this.kulor = kulor;
	}
	public int getVaerdi() {
		return vaerdi;
	}
	public void setVaerdi(int vaerdi) {
		this.vaerdi = vaerdi;
	}
	
	
}
