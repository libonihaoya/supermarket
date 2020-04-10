package cn.xm.supermarket.util;

/**
 * 用于返回状态和数据给客户端
 * 
 * @author asus
 *
 * @param <T> 泛型，可以是任何类型
 */
public class JsonResult<T> {

	private Integer state;
	private String message;
	private T data;
	
	
	public JsonResult(Integer state) {
		super();
		this.state = state;
	}
	
	public JsonResult(Integer state, String message) {
		super();
		this.state = state;
		this.message = message;
	}
	

	public JsonResult(Integer state, T data) {
		super();
		this.state = state;
		this.data = data;
	}
	

	/**
	 * @return the state
	 */
	public Integer getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(Integer state) {
		this.state = state;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(Throwable e) {
		this.message = e.getMessage();
	}
	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
	
	
	
}
