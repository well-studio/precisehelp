package cn.wellstudio.precisehelp.service;

import cn.wellstudio.precisehelp.entity.Couponstype;

/**
 * 用户使用购物券类型的业务层接口
 * @author huhong
 *
 */
public interface ICouponTypeService {
	//添加购物券种类
	public boolean addCouponType(Couponstype couponstype);

	//更新购物券种类
	public boolean updateCouponType(Couponstype couponstype);

	//删除购物券，即该种购物券无效
	public boolean removeCouponType(int typeId);
	
	//查询全部购物券类型
	public boolean findAllCouponType();
	
	//根据id查询购物券类型
	public Couponstype findCouponType(int typeId);
}
