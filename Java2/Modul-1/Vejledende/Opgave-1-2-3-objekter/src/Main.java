import java.util.Arrays;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		
		Loeve jan = new Loeve("Jan", false, true);
		Loeve mark = new Loeve("Mark", true, true);
		Loeve simba = new Loeve("Simba", false, false);
		
		List<Loeve> loever = Arrays.asList(jan, mark, simba);
		
		for (Loeve loeve: loever) {
			loeve.printHumør();	
		}

	}

}
