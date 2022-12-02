package dk.appacademy.primtal;

public class PrintPrimtalObserver implements PrimtalObserver {

	@Override
	public void notify(int tal) {
		System.out.println(tal);
	}

}
