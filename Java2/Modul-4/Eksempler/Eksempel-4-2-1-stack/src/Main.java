import java.util.*;

public class Main {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("Anders");
		stack.push("Betina");
		stack.push("Christoffer");
	
		while(!stack.isEmpty()) {
			String navn = stack.pop();
			System.out.println(navn);
		}
		
	}

}
