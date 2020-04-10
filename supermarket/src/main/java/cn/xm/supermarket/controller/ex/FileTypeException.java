package cn.xm.supermarket.controller.ex;

/**
 * 文件类型异常类
 * @author asus
 *
 */
public class FileTypeException extends FileUploadException {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2578132050011369259L;

	public FileTypeException() {
		super();
	}

	public FileTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FileTypeException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileTypeException(String message) {
		super(message);
	}

	public FileTypeException(Throwable cause) {
		super(cause);
	}

	
}
