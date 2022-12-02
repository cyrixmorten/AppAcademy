
public class Maaneder {

	public static void main(String[] args) {
		String[][] maaneder = { 
				{"Januar", "31"},
				{"Februar", "28"},
				{"Marts", "31"},
				{"April", "30"},
				{"Maj", "31"}, 
				{"Juni", "30"},
				{"Juli", "31"}, 
				{"August", "31"},
				{"September", "30"},
				{"Oktober", "31"},
				{"November", "30"},
				{"December", "31"}
		};

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(maaneder[i][j]);
				System.out.print(" ");
			}
			System.out.println(); // Lav linjeskift efter hver måned
		}
	}
}
