package com.assist7.remex.base.exception;

/**
 * remex运行异常
 * 
 * @author Qiaoxin.Hong
 *
 */
public class RemexException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public RemexException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RemexException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public RemexException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public RemexException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public RemexException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
