package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.IShoppingCartService;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 购物车控制器
 * @author huhong
 *
 */
public class ShoppingCartAction extends ActionSupport{
	
	IShoppingCartService shoppingCartService;
	public void setShoppingCartService(IShoppingCartService shoppingCartService) {
		this.shoppingCartService = shoppingCartService;
	}
	
	/**
	 * 商品加入购物车
	 * @return
	 */
	public String addGoodsToCart() {
		
		return null;
	}
	
	/**
	 * 更新购物车中商品数量
	 * @return
	 */
	public String updateGoodsNum() {
		
		return null;
	}
	
	/**
	 * 从购物车中移除商品
	 * @return
	 */
	public String removeGoods() {
		
		return null;
	}
	
	/**
	 * 根据用户查询购物车商品信息
	 * @return
	 */
	public String findCartByUser() {
		
		return null;
	}
	
	
	
}
