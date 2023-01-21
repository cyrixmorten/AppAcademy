import java.util.*;

public class Main {

	public static void main(String[] args) {
		String[] fynskeByer = {"Odense", "Bogense", "Middelfart", "Assens", "Faaborg", "Svendborg", "Nyborg", "Kerteminde"};
	
		// fra array til liste 
		List<String> list = Arrays.asList(fynskeByer);
		System.out.println("list: " + list);
		
		// fra liste til array 
		String[] array = list.toArray(new String[0]);
		System.out.println("array: " + Arrays.asList(array));
		
		// fyld liste over i array as passende størrelse
		String[] tilpasArray = new String[fynskeByer.length];
		list.toArray(tilpasArray);
		System.out.println("tilpasArray: " + Arrays.asList(tilpasArray));
	}

}
