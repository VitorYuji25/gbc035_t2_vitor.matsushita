package exception;

public class DomainException extends IllegalArgumentException{

	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
