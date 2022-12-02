package dk.kortspil;

import java.util.Random;

import dk.kortspil.Kort.KortKulor;

public class Kortspil {
	private Kort[] stak = new Kort[52];
	private int position;
	
	public Kortspil() {
		for (int i = 0; i < 13; i++) {
			Kort spar = new Kort(KortKulor.spar, i+1);
			Kort hjerter = new Kort(KortKulor.hjerter, i+1);
			Kort ruder = new Kort(KortKulor.ruder, i+1);
			Kort klor = new Kort(KortKulor.klor, i+1);
			
			int index = i * 4;
			stak[index] = spar;
			stak[index + 1] = hjerter;
			stak[index + 2] = ruder;
			stak[index + 3] = klor;
		}
	}

	public void bland() {
		for (int i = 0; i < 200; i++) {
			int index1 = new Random().nextInt(52);
			int index2 = new Random().nextInt(52);
			
			Kort midlertidig = stak[index1];
			stak[index1] = stak[index2];
			stak[index2] = midlertidig;
		}
	}
	
	public Kort traekKort() {
		Kort kort = stak[position];
		position++;
		return kort;
	}
}
