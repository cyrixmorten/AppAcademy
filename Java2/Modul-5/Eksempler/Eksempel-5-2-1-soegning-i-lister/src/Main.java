import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> fynskeByer = new ArrayList<>();
		fynskeByer.add("Odense");
		fynskeByer.add("Bogense");
		fynskeByer.add("Middelfart");
		fynskeByer.add("Assens");
		fynskeByer.add("Faaborg");
		fynskeByer.add("Svendborg");
		fynskeByer.add("Nyborg");
		fynskeByer.add("Kerteminde");
	
		int assens = fynskeByer.indexOf("Assens");
		System.out.println(assens);
		
		int aalborg = fynskeByer.indexOf("Aalborg");
		System.out.println(aalborg);
	}

}
