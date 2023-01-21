import java.util.Arrays;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		
		Bil skoda = new Skoda("Fabia", 1021, 1);
		Bil volvo = new Volvo("XC60", 1691, 2);
		Bil tesla = new Tesla("Model 3", 1611, 3);

		List<Bil> biler = Arrays.asList(skoda, volvo, tesla);
		
		for (Bil bil: biler) {
			System.out.println(bil.getProducentNavn() + " " + bil.getModelNavn() + ": " + bil.udledningGramPerKm());
		}
	}

}
