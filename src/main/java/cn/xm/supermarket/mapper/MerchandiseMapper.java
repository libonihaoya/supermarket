package cn.xm.supermarket.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Param;

import cn.xm.supermarket.entity.Merchandise;

/***
 * 商品持久层
 * @author asus
 *
 */
public interface MerchandiseMapper {
	
	/**
	 * 添加商品
	 * @param merchandise 添加的数据
	 * @return 受影响的行数
	 */
	Integer insertOne(Merchandise merchandise);
	
	/**
	 * 根据id修改num
	 * @param mid 商品id
	 * @param num 修改的数量
	 * @return 受影响的行数
	 */
	Integer updateNumByMid(
				@Param("mid") Integer mid,
				@Param("num") Integer num,
				@Param("modifiedUser") String modifiedUser,
				@Param("modifiedTime") Date modifiedTime);
	
	/**
	 * 通过商品名查找商品信息
	 * @param mname 商品名
	 * @return 返回该商品的信息
	 */
	Merchandise findByMname(String mname);
	
}
