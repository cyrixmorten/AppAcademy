
public class CPRNummer {

	private int cprNummer;

	CPRNummer(String cprNummerTekst) {
		this.cprNummer = this.parse(cprNummerTekst);
	}
	
	public int getCprNummer() {
		return this.cprNummer;
	}
	
	private int parse(String cprNummerTekst) {
		if (cprNummerTekst.length() < 10) {
			throw new IkkeValidCPRNummerException(cprNummerTekst, "CPR nummer skal have minimum 10 tal");
		}
		
		try {
			return Integer.parseInt(cprNummerTekst);
		} catch (NumberFormatException e) {
			throw new IkkeValidCPRNummerException(cprNummerTekst, "CPR nummer må kun bestå af tal");
		}
	}

}
