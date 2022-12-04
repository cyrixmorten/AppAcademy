
public class Dyr {

	private boolean vågen;
	private boolean sulten;
	

	public Dyr(boolean vågen, boolean sulten) {
		this.vågen = vågen;
		this.sulten = sulten;
	}
	
	public boolean isVågen() {
		return vågen;
	}
	public void setVågen(boolean vågen) {
		this.vågen = vågen;
	}
	public boolean isSulten() {
		return sulten;
	}
	public void setSulten(boolean sulten) {
		this.sulten = sulten;
	}
	
	public void givLyd() {
		// gør ikke noget her
	}
	
}

