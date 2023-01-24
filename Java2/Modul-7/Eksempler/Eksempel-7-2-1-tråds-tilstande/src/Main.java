public class Main {

	/*
	 * Tidligere eksempel med CounterRunnable hvor vi nu holder øje med 
	 * og printer trådens tilstand efterhånden som den ændrer sig.
	 */
	public static void main(String[] args) throws InterruptedException {

		CounterRunnable cr1 = new CounterRunnable("Tråd-1");
		Thread t1 = new Thread(cr1);
		t1.setName("CounterTråd");
		
		TilstandsCheckRunnable tilstandsChecker = new TilstandsCheckRunnable(t1);
		Thread tsc = new Thread(tilstandsChecker);
		
		tsc.start();
		
		// Vent en smule med at starte tællertråden så vi når at se NEW tilstand
		Thread.sleep(250);
		t1.start();
		
	}

}
