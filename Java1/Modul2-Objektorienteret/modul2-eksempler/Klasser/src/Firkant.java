
public class Firkant extends Figur {
	int bredde;
	int hojde;
	
	public Firkant(int bredde, int hojde) {
		this.bredde = bredde;
		this.hojde = hojde;
		
	}
	public int getAreal() {
		return bredde * hojde;
	}
	
	public void setBredde(int bredde) {
		this.bredde = bredde;
	}
	
	public int getBredde() {
		return bredde;
	}

	public int getHojde() {
		return hojde;
	}

	public void setHojde(int hojde) {
		this.hojde = hojde;
	}
}
