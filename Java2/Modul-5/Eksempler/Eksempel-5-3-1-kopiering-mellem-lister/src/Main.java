import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> storeDanskeByer = new ArrayList<>();
		storeDanskeByer.add("København");
		storeDanskeByer.add("Aarhus");
		storeDanskeByer.add("Odense");
		storeDanskeByer.add("Aalborg");
		
		List<String> fynskeByer = new ArrayList<>();
		fynskeByer.add("Odense");
		fynskeByer.add("Bogense");
		fynskeByer.add("Middelfart");
		fynskeByer.add("Assens");
		fynskeByer.add("Faaborg");
		fynskeByer.add("Svendborg");
		fynskeByer.add("Nyborg");
		fynskeByer.add("Kerteminde");
	
		// læg begge lister sammen
		List<String> alleByer = new ArrayList<>();
		alleByer.addAll(storeDanskeByer);
		alleByer.addAll(fynskeByer);
		System.out.println("alleByer (" + alleByer.size() + "): " + alleByer);
		
		// brug af hashset til at lægge listerne men fjerne duplikater  
		Set<String> unikkeByer = new HashSet<>();
		unikkeByer.addAll(storeDanskeByer);
		unikkeByer.addAll(fynskeByer);
		System.out.println("unikkeByer (" + unikkeByer.size() + "): " + unikkeByer);
		
		// brug retainAll til at udpege fynske byer der også er i listen af store danske byer
		List<String> alleStoreFynskeByer = new ArrayList<>();
		alleStoreFynskeByer.addAll(storeDanskeByer);
		alleStoreFynskeByer.retainAll(fynskeByer);
		System.out.println("alleStoreFynskeByer (" + alleStoreFynskeByer.size() + "): " + alleStoreFynskeByer);
	}

}
