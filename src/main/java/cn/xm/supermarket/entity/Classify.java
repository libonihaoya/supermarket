package cn.xm.supermarket.entity;

import java.io.Serializable;

public class Classify implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4644406872917745563L;
	
	private Integer cid ;//分类id 主键自增
	private Integer parent; 
	private Integer code; 
	private String cname;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cid == null) ? 0 : cid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Classify other = (Classify) obj;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Classify [cid=" + cid + ", parent=" + parent + ", code=" + code + ", cname=" + cname + "]";
	}
	
	

}
