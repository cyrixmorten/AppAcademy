
public class Cirkel extends Figur {
	int radius;

	public Cirkel(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getAreal() {
		return (int) (Math.PI * radius * radius);
	}
}
