
public class NumberFormatException {

	public static void main(String[] args) {

		/* 
		 * tænkt eksempel hvor vi får et CPR nummer ind fra et input felt
		 * man havde tænkt det kun skulle bestå af tal, men her har brugeren indsat en streg imellem talene
		 */
		String cprNummer = "041184-3431";
		
		int konverterCPRTilTal = Integer.parseInt(cprNummer); 

	}

}
