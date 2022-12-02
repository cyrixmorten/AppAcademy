
public class Trekant extends Figur {
	private int sideA;
	private int sideB;
	private int sideC;
	
	public Trekant(int sideA, int sideB, int sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public int getSideA() {
		return sideA;
	}

	public void setSideA(int sideA) {
		this.sideA = sideA;
	}

	public int getSideB() {
		return sideB;
	}

	public void setSideB(int sideB) {
		this.sideB = sideB;
	}

	public int getSideC() {
		return sideC;
	}

	public void setSideC(int sideC) {
		this.sideC = sideC;
	}

	public int getOmkreds() {
		return sideA + sideB + sideC;
	}

}
