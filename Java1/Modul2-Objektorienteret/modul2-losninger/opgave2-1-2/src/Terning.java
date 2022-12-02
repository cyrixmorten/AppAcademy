import java.util.Random;

public class Terning {
	public static int kastTerning(int antalSider) {
		int terning = new Random().nextInt(antalSider); 
		terning++; 
		return terning;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			System.out.println(kastTerning(10));
		}
	}
}
