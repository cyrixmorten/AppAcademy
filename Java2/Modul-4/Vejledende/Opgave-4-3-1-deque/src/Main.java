import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		for (int i = 1; i <= 13; i++) {
			deque.push(i);
		}
		
	
		while(!deque.isEmpty()) {
			int fraToppen = deque.pollLast();
			System.out.println("Fra toppen: " + fraToppen);
			
			if (!deque.isEmpty()) {
				int fraBunden = deque.pollFirst();
				System.out.println("Fra bunden: " + fraBunden);
			} else {
				System.out.println("Kunne ikke trække fra bunden - er ikke flere kort");
			}
		}
	}

}
