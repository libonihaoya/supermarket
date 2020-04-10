package cn.xm.supermarket.controller.ex;

/**
 * 文件大小异常类
 * @author asus
 *
 */
public class FileSizeException extends FileUploadException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -975652741168492087L;

	public FileSizeException() {
		super();
	}

	public FileSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FileSizeException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileSizeException(String message) {
		super(message);
	}

	public FileSizeException(Throwable cause) {
		super(cause);
	}

	
}
