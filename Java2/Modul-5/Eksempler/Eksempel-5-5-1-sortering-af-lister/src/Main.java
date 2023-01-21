import java.util.*;

public class Main {

	public static void main(String[] args) {
		String[] fynskArray = {"Odense", "Bogense", "Middelfart", "Assens", "Faaborg", "Svendborg", "Nyborg", "Kerteminde"};
		
		Comparator<String> c = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				Integer len1 = o1.length();
				Integer len2 = o2.length();
				return len1.compareTo(len2);
			}
		};
		
		List<String> sorteretAlfabetisk = Arrays.asList(fynskArray);
		Collections.sort(sorteretAlfabetisk);
		System.out.println(sorteretAlfabetisk);
		
		List<String> sorteretEfterLængde = Arrays.asList(fynskArray);
		sorteretEfterLængde.sort(c);
		System.out.println(sorteretEfterLængde);		

	}

}
