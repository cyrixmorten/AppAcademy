
public class Firkant extends Figur{
	private int bredde;
	private int hojde;
	
	public Firkant(int bredde, int hojde) {
		this.bredde = bredde;
		this.hojde = hojde;
	}
	
	public int getBredde() {
		return bredde;
	}
	public void setBredde(int bredde) {
		this.bredde = bredde;
	}
	public int getHojde() {
		return hojde;
	}
	public void setHojde(int hojde) {
		this.hojde = hojde;
	}

	public int getOmkreds() {
		return (2 * bredde) + (2 * hojde); 
	}
	
	
}
