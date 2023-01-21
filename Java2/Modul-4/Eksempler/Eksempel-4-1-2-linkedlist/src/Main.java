import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Anders");
		list.add("Betina");
		list.add("Christoffer");
	
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
