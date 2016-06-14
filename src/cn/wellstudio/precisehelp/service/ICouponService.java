package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Coupons;

/**
 * 用户购物券的业务层接口
 * @author huhong
 *
 */
public interface ICouponService {
	//添加一张购物券
	public boolean addCoupon(Coupons coupons);
	
	//更新购物券信息
	public boolean updateCoupon(Coupons coupons);

	//删除购物券信息
	public boolean deleteCoupon(int CouId);

	//根据购物券编号查询购物券
	public Coupons findCouponByNum(String couNum);

	//查询全部的购物券
	public List<Coupons> findAllCoupon();
	
	//根据用户查询购物券
	public List<Coupons> findCouponByUser(int usersId);
	
	//根据购物券类型查询购物券信息
	public List<Coupons> findCouponByType(int typeId);

	//根据购物券类型查询购物券信息
	public List<Coupons> findCouponByType(String typeName);
}
