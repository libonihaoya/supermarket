package cn.xm.supermarket.controller;

import javax.servlet.http.HttpSession;

public class BaseController {
	/**
	  * 响应到客户端的操作成功状态码
	  */
	 public  static final String OK = "2000";

	 protected final Integer getUidFromSession(HttpSession session){
	  return  Integer.valueOf(session.getAttribute("uid").toString());
	 }
	 
	 protected final String getUsernameFromSession (HttpSession session){
	  return  session.getAttribute("username").toString();

	 }
}
