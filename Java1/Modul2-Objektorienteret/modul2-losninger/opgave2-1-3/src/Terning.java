import java.util.Random;

public class Terning {
	public static int kastTerning(int antalTerninger, int antalSider) {
		int sum = 0;
		for (int i = 0; i < antalTerninger; i++) {
			int terning = new Random().nextInt(6); // Intervallet 0-5
			terning++; // intervallet 1-6
			sum += terning;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(kastTerning(10,6));
	}
}
