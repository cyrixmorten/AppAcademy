
public class CounterRunnable implements Runnable {

	private Counter counter;
	
	public CounterRunnable(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		counter.count();	
	}

}
