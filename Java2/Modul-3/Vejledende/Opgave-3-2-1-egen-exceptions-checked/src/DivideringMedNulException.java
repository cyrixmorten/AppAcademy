
public class DivideringMedNulException extends Exception {

	public DivideringMedNulException() {
		this("Det er ikke tilladt at dividere med nul");
	}

	public DivideringMedNulException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DivideringMedNulException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DivideringMedNulException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DivideringMedNulException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
