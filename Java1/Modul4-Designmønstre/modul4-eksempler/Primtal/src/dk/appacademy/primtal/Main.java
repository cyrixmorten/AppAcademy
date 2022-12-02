package dk.appacademy.primtal;

public class Main {

	public static void main(String[] args) {
		PrimtalGenerator generator = new PrimtalGenerator();
		PrintPrimtalObserver observer = new PrintPrimtalObserver();
		
		generator.registerObserver(observer);
		generator.start();
	}

}
