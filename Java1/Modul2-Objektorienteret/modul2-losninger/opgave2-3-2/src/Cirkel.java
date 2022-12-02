
public class Cirkel extends Figur {
	private int radius;
	
	public Cirkel(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getOmkreds() {
		return (int) (2 * Math.PI * radius);
	}

}
