
public class MainProgram {

	public static void main(String[] args) {
		for (int tal = 1; tal <= 50; tal++) {
			if (tal % 2 == 0) {
				System.out.println("Lige tal" + tal);
			} else {
				System.out.println("Ulige tal: " + tal);
			}
		}
	}

}
