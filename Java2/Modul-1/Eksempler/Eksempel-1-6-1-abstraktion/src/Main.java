import java.util.Arrays;
import java.util.List;

public class Main {

	/*
	 * TimeLoensMedarbejder og MaanedsLoensMedarbejder har hver sin implementation af beregnLøn().
	 * 
	 * Fordi begge stammer fra Medarbejder, kan vi løbe alle medarbejdere igennem til sidst uden at forholde os til 
	 * om de er ansat på månedsløn eller per. time.
	 * 
	 * Dette eksempel er næsten identisk med Eksempel-5-polymorfi, men her har vi markeret klasserne Person og Medarbejder 
	 * som værende *abstract*, det samme gælder metoden beregnLøn() i Medearbejder klassen. 
	 * Det betyder at man ikke længere kan oprette objekter direkte af de to klasser. Den eneste måde at bruge dem på er via 
	 * nedarvning, altså ved at bruge *extends*. 
	 * Dette er en forbedring da det hjælper med at fortælle at det altså er en af de mere specifikke versioner af medarbejder 
	 * der skal bruges til at oprette objekt instanser af. 
	 * Yderligere hjælper det hvis man vil oprette en ny type medarbejder. Lad os sige vi ville tilføje en 
	 * ny medarbejdertype, FleksjobMedarbejder. Så snart vi extender Medarbejder vil det nu automatisk blive påkrævet at vi laver 
	 * vores egen version af beregnLøn(). Noget man i tidligere eksempel sagtens kunne undlade/glemme med det resultat at beregnLøn() 
	 * altid ville returnere 0, for det var sådan den var defineret i Medarbejder klassen.
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
