/*
 *  Den øverste klasse i vores nedarvnings hierarki.
 * 
 *  Indtil videre defineres en person helt simpelt ved at kunne have et navn. 
 *  
 *  Vi vælger både at give navn i Constructoren, samt udstille Setter og Getter. Grunden hertil er, at med Constructoren 
 *  sørger vi for, at alle der bruger denne klasse husker at sætte et navn. Det kan ikke lade sig gøre at oprette en person 
 *  uden at give et navn med. Omvendt skal det gerne være muligt at ændre navnet efterfølgende, derfor udstiller vi også 
 *  en Setter til at opdatere navnet. 
 */
public class Person {

	private String navn;

	Person(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}
	

}

