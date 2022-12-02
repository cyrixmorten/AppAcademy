package dk.appacademy.unikkeord;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void tael(String saetning) {
		String[] ord = saetning.split(" ");
		Set<String> ordSet = new HashSet<>();
		for (String o : ord) {
			ordSet.add(o);
		}
		
		for (String s : ordSet) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		tael("Her er en sætning. Det er en lang sætning.");
	}
}
