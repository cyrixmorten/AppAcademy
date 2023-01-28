import java.util.*;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 1; i <= 13; i++) {
			stack.push(i);
		}

		Collections.shuffle(stack);
		
		Iterator<Integer> iterator = stack.iterator();
		
		System.out.println("De blandede kort organiseret i en Stack:");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		while(!stack.isEmpty()) {
			queue.add(stack.pop());
		}
		
		System.out.println("Kortene lagt i rækkefølge i en PriorityQueue:");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
