package cn.xm.supermarket.service.ex;

/**
 * 插入数据时异常
 * @author asus
 *
 */
public class InsertException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4508375020818985755L;

	public InsertException() {
		super();
	}

	public InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InsertException(String message, Throwable cause) {
		super(message, cause);
	}

	public InsertException(String message) {
		super(message);
	}

	public InsertException(Throwable cause) {
		super(cause);
	}

	
}
