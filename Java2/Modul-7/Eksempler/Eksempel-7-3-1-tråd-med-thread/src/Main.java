public class Main {

	public static void main(String[] args) {

		CounterThread t1 = new CounterThread("Tråd-1");
		CounterThread t2 = new CounterThread("Tråd-2");
		
		t1.start();
		t2.start();
		
	}

}
