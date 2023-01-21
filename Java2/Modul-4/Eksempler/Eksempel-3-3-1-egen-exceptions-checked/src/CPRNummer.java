
public class CPRNummer {

	private int cprNummer;

	CPRNummer(String cprNummerTekst) throws IkkeValidCPRNummerException {
		this.cprNummer = this.parse(cprNummerTekst);
	}
	
	public int getCprNummer() {
		return this.cprNummer;
	}
	
	private int parse(String cprNummerTekst) throws IkkeValidCPRNummerException {
		if (cprNummerTekst.length() < 10) {
			throw new IkkeValidCPRNummerException("CPR nummer skal have minimum 10 tal");
		}
		
		try {
			return Integer.parseInt(cprNummerTekst);
		} catch (NumberFormatException e) {
			throw new IkkeValidCPRNummerException("CPR nummer må kun bestå af tal");
		}
	}

}
