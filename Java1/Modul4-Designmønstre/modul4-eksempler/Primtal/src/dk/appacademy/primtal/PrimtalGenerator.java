package dk.appacademy.primtal;

public class PrimtalGenerator {
	private PrimtalObserver observer;
	
	public void registerObserver(PrimtalObserver observer) {
		this.observer = observer;
	}
	
	public void start() {
		for (int tal = 2; tal < Integer.MAX_VALUE; tal++) {
			boolean isPrime = true;
			for (int i = 2; i < Math.sqrt(tal); i++) {
				if (tal % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				observer.notify(tal);
			}
		}
	}
}
