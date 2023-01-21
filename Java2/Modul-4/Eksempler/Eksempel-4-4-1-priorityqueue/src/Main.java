import java.util.*;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		queue.add(20);
		queue.add(10);
		queue.add(30);
	
		while(!queue.isEmpty()) {
			int tal = queue.poll();
			System.out.println(tal);
		}
	}

}
