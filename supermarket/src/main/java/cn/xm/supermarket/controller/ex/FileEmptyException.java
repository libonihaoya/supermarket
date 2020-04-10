package cn.xm.supermarket.controller.ex;

/**
 * 文件为空异常类
 * @author asus
 *
 */
public class FileEmptyException extends FileUploadException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1004579765437711200L;

	public FileEmptyException() {
		super();
	}

	public FileEmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FileEmptyException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileEmptyException(String message) {
		super(message);
	}

	public FileEmptyException(Throwable cause) {
		super(cause);
	}

	
}
