package cn.xm.supermarket.entity;

import java.util.Date;

public class Merchandise extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1244386681498369348L;
	
	private Integer mid  ;  //商品表id 主键自增
	private String mname; //商品名
	private String image;//商品图片
	private Double price;  //售价
	private Double costPrice; //进价
	private Integer num; //数量
	private Integer cid;  //分类id
	private String datail; //商品描述
	private Integer isPutaway;  //是否上架  0上架/1下架
	private Date addTime ; //入库时间
	private Date lunchTime; //上架时间
	private Date soldoutTime; //下架时间
	/**
	 * @return the mid
	 */
	public Integer getMid() {
		return mid;
	}
	/**
	 * @param mid the mid to set
	 */
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	/**
	 * @return the mname
	 */
	public String getMname() {
		return mname;
	}
	/**
	 * @param mname the mname to set
	 */
	public void setMname(String mname) {
		this.mname = mname;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the costPrice
	 */
	public Double getCostPrice() {
		return costPrice;
	}
	/**
	 * @param costPrice the costPrice to set
	 */
	public void setCostPrice(Double costPrice) {
		this.costPrice = costPrice;
	}
	/**
	 * @return the num
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * @return the cid
	 */
	public Integer getCid() {
		return cid;
	}
	/**
	 * @param cid the cid to set
	 */
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	/**
	 * @return the datail
	 */
	public String getDatail() {
		return datail;
	}
	/**
	 * @param datail the datail to set
	 */
	public void setDatail(String datail) {
		this.datail = datail;
	}
	/**
	 * @return the isPutaway
	 */
	public Integer getIsPutaway() {
		return isPutaway;
	}
	/**
	 * @param isPutaway the isPutaway to set
	 */
	public void setIsPutaway(Integer isPutaway) {
		this.isPutaway = isPutaway;
	}
	/**
	 * @return the addTime
	 */
	public Date getAddTime() {
		return addTime;
	}
	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	/**
	 * @return the lunchTime
	 */
	public Date getLunchTime() {
		return lunchTime;
	}
	/**
	 * @param lunchTime the lunchTime to set
	 */
	public void setLunchTime(Date lunchTime) {
		this.lunchTime = lunchTime;
	}
	/**
	 * @return the soldoutTime
	 */
	public Date getSoldoutTime() {
		return soldoutTime;
	}
	/**
	 * @param soldoutTime the soldoutTime to set
	 */
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
		return "Merchandise [mid=" + mid + ", mname=" + mname + ", image=" + image + ", price=" + price + ", costPrice="
				+ costPrice + ", num=" + num + ", cid=" + cid + ", datail=" + datail + ", isPutaway=" + isPutaway
				+ ", addTime=" + addTime + ", lunchTime=" + lunchTime + ", soldoutTime=" + soldoutTime + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
