package cn.xm.supermarket.service.ex;

/**
 * 修改数据时异常
 * @author asus
 *
 */
public class UpdateException extends ServiceException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6944768695010941834L;

	public UpdateException() {
		super();
	}

	public UpdateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UpdateException(String message, Throwable cause) {
		super(message, cause);
	}

	public UpdateException(String message) {
		super(message);
	}

	public UpdateException(Throwable cause) {
		super(cause);
	}

	
}
