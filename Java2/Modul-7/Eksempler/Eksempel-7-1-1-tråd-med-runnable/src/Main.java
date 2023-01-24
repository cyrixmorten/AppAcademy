public class Main {

	public static void main(String[] args) {

		CounterRunnable cr1 = new CounterRunnable("Tråd-1");
		Thread t1 = new Thread(cr1);
		t1.start();
		

		CounterRunnable cr2 = new CounterRunnable("Tråd-2");
		Thread t2 = new Thread(cr2);
		t2.start();
		
		
	}

}
