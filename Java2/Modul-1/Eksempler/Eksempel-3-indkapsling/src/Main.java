
public class Main {

	/*
	 * Klasserne PrivateBy og PublicBy kan slå et bynavn op ud fra postnummer.
	 * 
	 * Metoden hentByNavn() kunne man forestille sig slog navnet på byen op i en database.
	 * 
	 * Vi ønsker ikke at andre dele af programmet skal kunne ændre i hverken postnummer eller navn, derfor er de 
	 * markeret som private i PrivateBy.
	 * 
	 */
	public static void main(String[] args) {

		PublicBy publicBy = new PublicBy(8200);
		System.out.println("By uden indkapsling før ændring: " + publicBy.getPostNummer() + " " + publicBy.getByNavn());
		publicBy.byNavn = "Nyt navn";
		publicBy.postNummer = 1234;
		System.out.println("By uden indkapsling efter ændring: " + publicBy.getPostNummer() + " " + publicBy.getByNavn());
		
		PrivateBy privateBy = new PrivateBy(1055);
		//privateBy.byNavn = "Nyt navn"; 	kan man ikke fordi byNavn er markeret som private
		//privateBy.postNummer = 1234;		kan man ikke fordi porstnummer er markeret som private		
		System.out.println("By med indkapsling: " + privateBy.getPostNummer() + " " + privateBy.getByNavn());
		
	}

}
