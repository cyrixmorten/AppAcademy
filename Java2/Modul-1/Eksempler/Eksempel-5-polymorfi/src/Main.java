import java.util.Arrays;
import java.util.List;

public class Main {

	/*
	 * TimeLoensMedarbejder og MaanedsLoensMedarbejder har hver sin implementation af beregnLøn().
	 * 
	 * Fordi begge stammer fra Medarbejder, kan vi løbe alle medarbejdere igennem til sidst uden at forholde os til 
	 * om de er ansat på månedsløn eller per. time.
	 * 
	 */
	public static void main(String[] args) {


		TimeLoensMedarbejder timeLønsAnsat = new TimeLoensMedarbejder("Jens", 123, 167.45);
		MaanedsLoensMedarbejder månedsLønsAnsat = new MaanedsLoensMedarbejder("Anne", 321, 2760.50);
		
		timeLønsAnsat.setAntalTimer(37 * 4);
		
		List<Medarbejder> medarbejdere = Arrays.asList(timeLønsAnsat, månedsLønsAnsat);
		
		for (Medarbejder medarbejder: medarbejdere) {
			System.out.println(medarbejder.getNavn() + " får i denne måned: " + medarbejder.beregnLøn());
		}
	}

}
