public class Main {

	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread t1 = new Thread(new CounterRunnable(counter));
		Thread t2 = new Thread(new CounterRunnable(counter));
		
		try {
			t1.start();
			t2.start();
			
			t2.join();
			t1.join();
		} catch (InterruptedException e) {
			System.out.println("Trådene blev afbrudt");
		}
		
		
	}

}
