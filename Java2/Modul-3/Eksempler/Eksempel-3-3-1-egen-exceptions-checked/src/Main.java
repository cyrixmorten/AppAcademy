
public class Main {

	public static void main(String[] args) {

		CPRNummer forKort = indlaesCPRNummer("123");
		CPRNummer indeholderAndetEndTal = indlaesCPRNummer("123123-1234");
		CPRNummer gyldigtCPR = indlaesCPRNummer("1231231234");
	
		System.out.println("forKort: " + forKort);
		System.out.println("indeholderAndetEndTal: " + indeholderAndetEndTal);
		System.out.println("gyldigtCPR: " + gyldigtCPR);
	}
	
	private static CPRNummer indlaesCPRNummer(String cprNummer) {
		try {
			return new CPRNummer(cprNummer);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
