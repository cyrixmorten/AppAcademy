import java.lang.Thread.State;

public class TilstandsCheckRunnable implements Runnable {

	private final Thread thread;
	private State state;
	
	public TilstandsCheckRunnable(Thread thread) {
		this.thread = thread;
		
	}
	
	@Override
	public void run() {
		while (thread.isAlive() || thread.getState() == Thread.State.NEW) {	
			checkState();
		}

		checkState();
	}

	private void checkState() {
		if (thread.getState() != state) {
			state = thread.getState();
			
			System.out.println(thread.getName() + ": " + thread.getState());
		}
	}
}
