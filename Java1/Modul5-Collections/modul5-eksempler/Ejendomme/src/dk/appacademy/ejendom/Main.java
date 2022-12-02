package dk.appacademy.ejendom;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Ejendom e1 = new Ejendom();
		e1.setAdresse("Torvet 15");
		e1.setKvadratmeter(180);
		
		Ejendom e2 = new Ejendom();
		e2.setAdresse("Borgergade 17");
		e2.setKvadratmeter(225);
		
		List<Ejendom> ejendomslist = new ArrayList<>();
		ejendomslist.add(e1);
		ejendomslist.add(e2);
		
		for (Ejendom ejendom : ejendomslist) {
			System.out.println(ejendom.getAdresse() + " " + ejendom.getKvadratmeter() + " kvm.");
		}
	}

}
