
public class Kat extends Kaeledyr {
	
	public Kat(String navn, boolean vågen, boolean sulten) {
		super(navn, vågen, sulten);
	}
	
	@Override
	public void givLyd() {
		if (!isVågen()) {
			System.out.println("ZzzZz");
		} 
		if (isSulten()) {
			System.out.println("Drauww!");
		} 
		if (isVågen() && isSulten()) {
			System.out.println("Miav!");
		}
	}
}
