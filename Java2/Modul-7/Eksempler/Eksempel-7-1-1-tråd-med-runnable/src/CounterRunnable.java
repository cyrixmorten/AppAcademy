
public class CounterRunnable implements Runnable {

	private String name;
	
	public CounterRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + ": " + i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				System.out.println(name + " blev interrupted");
			}
		}
	}

}
