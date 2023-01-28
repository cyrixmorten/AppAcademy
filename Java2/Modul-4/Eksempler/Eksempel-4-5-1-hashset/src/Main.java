import java.util.*;

public class Main {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Anders");
		set.add("Elias");
		set.add("Anders");
	
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
	}

}
