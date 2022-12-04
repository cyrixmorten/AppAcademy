
public class Kat extends Kaeledyr {
	
	Kat(String navn) {
		super(navn);
	}

	public void sigMiav() {
		if (isVågen() && isSulten()) {
			System.out.println("Miav!");
		}
	}
}
