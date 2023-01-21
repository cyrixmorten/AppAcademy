import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>();
		queue.push("Adam");
		queue.push("Christina");
		queue.push("Dorte");
	
		while(!queue.isEmpty()) {
			String navn = queue.poll();
			System.out.println(navn);
		}
	}

}
