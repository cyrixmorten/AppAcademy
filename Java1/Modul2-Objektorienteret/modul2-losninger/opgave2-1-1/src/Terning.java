import java.util.Random;

public class Terning {
	public static int kastTerning() {
		int terning = new Random().nextInt(6); // Intervallet 0-5
		terning++; // intervallet 1-6
		return terning;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			System.out.println(kastTerning());
		}
	}
}
