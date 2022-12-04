
public class Hund extends Kaeledyr {
	
	public Hund(String navn, boolean vågen, boolean sulten) {
		super(navn, vågen, sulten);
	}

	@Override
	public void givLyd() {
		if (!isVågen()) {
			System.out.println("ZzzZz");
		} 
		if (isSulten()) {
			System.out.println("Piv!");
		} 
		if (isVågen() && isSulten()) {
			System.out.println("Vov!");
		} 
	}
}
