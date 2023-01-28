import java.util.*;

public class Main {

	public static void main(String[] args) {
		HashMap<String, String> telefonbog = new HashMap<>();
		telefonbog.put("60616263", "Anders");
		telefonbog.put("50505050", "Christina");
		telefonbog.put("87414613", "Dorte");
	
		String navn = telefonbog.get("60616263");
		
		System.out.println(navn);
	}

}
