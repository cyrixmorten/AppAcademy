
public class Main {

	public static void main(String[] args) {
		
		Loeve jan = new Loeve("Jan", false, true);
		Loeve mark = new Loeve("Mark", true, true);
		Loeve simba = new Loeve("Simba", false, false);
		
		jan.printHumør();
		mark.printHumør();
		simba.printHumør();
	}

}
