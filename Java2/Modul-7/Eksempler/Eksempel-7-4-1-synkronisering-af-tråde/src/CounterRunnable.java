
public class CounterRunnable implements Runnable {

	private Counter counter;
	
	public CounterRunnable(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		synchronized (counter) {
			counter.count();	
		}
	}

}
