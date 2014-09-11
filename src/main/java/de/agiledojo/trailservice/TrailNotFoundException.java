package de.agiledojo.trailservice;

public class TrailNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TrailNotFoundException() {
		super();
	}

	public TrailNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public TrailNotFoundException(String message) {
		super(message);
	}

}
