package dk.appacademy.ord;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void tael(String saetning) {
		String[] ord = saetning.split(" ");
		Map<String, Integer> ordMap = new HashMap<>();
		for (String o : ord) {
			if (ordMap.containsKey(o)) {
				int antalForekomster = ordMap.get(o);
				antalForekomster++;
				ordMap.put(o, antalForekomster);
			} else {
				ordMap.put(o, 1);
			}
		}
		
		for (String o : ordMap.keySet()) {
			System.out.println(o + " findes " + ordMap.get(o) + " gange");
		}
	}
	
	public static void main(String[] args) {
		tael("Denne tekst er så lang så nogle ord er der flere gange");
	}
}
