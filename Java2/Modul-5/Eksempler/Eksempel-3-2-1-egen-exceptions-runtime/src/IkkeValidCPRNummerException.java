
public class IkkeValidCPRNummerException extends RuntimeException {

	public IkkeValidCPRNummerException(String cprNummer, String besked) {
		this(besked + " - Modtog tekst: " + cprNummer);
	}

	public IkkeValidCPRNummerException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public IkkeValidCPRNummerException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public IkkeValidCPRNummerException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public IkkeValidCPRNummerException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
