package cn.xm.supermarket.entity;

import java.io.Serializable;
import java.util.Date;

public class BaseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7284510354156509516L;
	String createdUser; //创建人
	Date createdTime; //创建时间
	String modifiedUser;// 最后修改人
	Date modifiedTime; //最后修改时间
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	@Override
	public String toString() {
		return "BaseEntity [createdUser=" + createdUser + ", createdTime=" + createdTime + ", modifiedUser="
				+ modifiedUser + ", modifiedTime=" + modifiedTime + "]";
	}
	
	
}
