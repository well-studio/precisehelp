package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.ICouponService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 购物券控制器
 * @author huhong
 *
 */
public class CouponAction extends ActionSupport{
	
	ICouponService couponService;
	public void setCouponService(ICouponService couponService) {
		this.couponService = couponService;
	}
	
	/**
	 * 添加一张购物券
	 * @return
	 */
	public String addCoupon() {
		
		return null;
	}
	
	/**
	 * 更新购物券信息
	 * @return
	 */
	public String updateCoupon() {
		
		return null;
	}
	
	/**
	 * 删除购物券信息
	 * @return
	 */
	public String deleteCoupon() {
		
		return null;
	}
	
	/**
	 * 根据购物券编号查询购物券
	 * @return
	 */
	public String findCouponByNum() {
		
		return null;
	}
	
	/**
	 * 查询全部的购物券
	 * @return
	 */
	public String findAllCoupon() {
		
		return null;
	}
	
	/**
	 * 根据用户查询购物券
	 * @return
	 */
	public String findCouponByUser() {
		
		return null;
	}
	
	/**
	 * 根据购物券类型查询购物券信息
	 * @return
	 */
	public String findCouponByType() {
		
		return null;
	}
}
