
public class Main {
	public static void main(String[] args) {
		Dyr[] kennel = new Dyr[] { new Hund(), new Kat(), new Kat(), new Hund(), new Hund() };
		for (Dyr dyr : kennel) {
			dyr.sigNoget();
		}
	}
}
