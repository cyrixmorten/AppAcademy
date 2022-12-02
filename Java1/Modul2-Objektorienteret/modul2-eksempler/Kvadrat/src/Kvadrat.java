
public class Kvadrat {

	public static int beregnKvadrat(int tal) {
		return tal * tal;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Kvadratet af " + i + " er: " + beregnKvadrat(i));
		}
		
	}

}
