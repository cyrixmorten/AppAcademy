
public class Hund extends Kaeledyr {
	
	Hund(String navn) {
		super(navn);
	}

	public void sigVov() {
		if (isVågen() && isSulten()) {
			System.out.println("Vov!");
		}
	}
}
