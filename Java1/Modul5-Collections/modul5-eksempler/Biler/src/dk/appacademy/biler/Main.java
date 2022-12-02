package dk.appacademy.biler;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bil b1 = new Bil();
		b1.setFarve("Gul");
		b1.setRegistreringsnummer("AB 23 235");
		
		Bil b2 = new Bil();
		b2.setFarve("Rød");
		b2.setRegistreringsnummer("BC 21 532");
		
		List<Bil> biler = new ArrayList<>();
		
		biler.add(b1);
		biler.add(b2);
		
		biler.stream().
			filter(b -> b.getFarve().equals("Gul")).
			forEach(b -> System.out.println(b.getRegistreringsnummer()));
	}
}
