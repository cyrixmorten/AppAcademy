import java.util.*;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 1; i <= 13; i++) {
			stack.push(i);
		}

		Collections.shuffle(stack);
	
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
