package cn.xm.supermarket.util;

/**
 * 用于封装响应给客户端的JSON数据的属性的类
 * @author Hasee
 *
 * @param <T>操作成功时响应到客户端的数据的泛型
 */
public class JsonResult<T> {
	/**
	 * 响应状态
	 */
	private String state;
	/**
	 * 操作失败时的提示信息
	 */
	private String message;//注册失败，用户名已被占用
	/**
	 * 操作成功时响应到客户端的数据
	 */
	private T data;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public JsonResult(String state) {
		super();
		this.state = state;
	}
	public JsonResult() {
		super();
	}
	public JsonResult(Throwable e) {
		super();
		this.message = e.getMessage();
	}
	public JsonResult(String state, T data) {
		super();
		this.state = state;
		this.data = data;
	}
	
	
}
