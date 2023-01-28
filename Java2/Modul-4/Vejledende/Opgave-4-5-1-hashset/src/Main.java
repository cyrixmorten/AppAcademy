import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Anders");
		list.add("Betina");
		list.add("Christoffer");
		list.add("Anders");
		list.add("Mark");
		list.add("Sofie");
		list.add("Mark");
		
		Set<String> set = new HashSet<>(list);
	
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
	}

}
