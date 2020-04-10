package cn.xm.supermarket.controller.ex;

/**
 * 文件上传基类
 * @author asus
 *
 */
public class FileUploadException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5306355302456342457L;

	public FileUploadException() {
		super();
	}

	public FileUploadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FileUploadException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileUploadException(String message) {
		super(message);
	}

	public FileUploadException(Throwable cause) {
		super(cause);
	}

	
	
}
