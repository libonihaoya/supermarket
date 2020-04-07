package cn.xm.supermarket.entity;

import java.util.Date;

public class Merchandise extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7807654630887260564L;
	Integer mid  ;  //商品表id 主键自增
	String mname; //商品名
	Double price;  //售价
	Double costPrice; //进价
	Integer num; //数量
	Integer cid;  //分类id
	String datail; //商品描述
	Integer isPutaway;  //是否上架  0上架/1下架
	Date addTime ; //入库时间
	Date lunchTime; //上架时间
	Date soldoutTime; //下架时间
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getDatail() {
		return datail;
	}
	public void setDatail(String datail) {
		this.datail = datail;
	}
	public Integer getIsPutaway() {
		return isPutaway;
	}
	public void setIsPutaway(Integer isPutaway) {
		this.isPutaway = isPutaway;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getLunchTime() {
		return lunchTime;
	}
	public void setLunchTime(Date lunchTime) {
		this.lunchTime = lunchTime;
	}
	public Date getSoldoutTime() {
		return soldoutTime;
	}
	public void setSoldoutTime(Date soldoutTime) {
		this.soldoutTime = soldoutTime;
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
		Merchandise other = (Merchandise) obj;
		if (cid == null) {
			if (other.cid != null)
				return false;
		} else if (!cid.equals(other.cid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Classify [mid=" + mid + ", mname=" + mname + ", price=" + price + ", costPrice=" + costPrice + ", num="
				+ num + ", cid=" + cid + ", datail=" + datail + ", isPutaway=" + isPutaway + ", addTime=" + addTime
				+ ", lunchTime=" + lunchTime + ", soldoutTime=" + soldoutTime + ", createdUser=" + createdUser
				+ ", createdTime=" + createdTime + ", modifiedUser=" + modifiedUser + ", modifiedTime=" + modifiedTime
				+ "]";
	}
	
}
