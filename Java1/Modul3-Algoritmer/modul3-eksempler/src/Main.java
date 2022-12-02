
public class Main {

	public static void main(String[] args) {
		int[] mineTal = {43, 56, 1, 6, 8, 3, 21};
		bubblesort(mineTal);
		for (int i : mineTal) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void bubblesort(int[] tal) {
		boolean erDerByttet = false;
		do {
			erDerByttet = false;
			for (int i = 0; i < tal.length -1; i++) {
				int tal1 = tal[i];
				int tal2 = tal[i+1];
				if (tal1 > tal2) {
					tal[i] = tal2;
					tal[i+1] = tal1;
					erDerByttet = true;
				}
			}
		} while (erDerByttet);
	}

}
