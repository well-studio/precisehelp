package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Shoppingcart;

/**
 * 购物车业务接口设计
 * @author huhong
 *
 */
public interface IShoppingCartService {
	
	/**
	 * 添加商品进入购物车
	 * @param goods
	 * @return
	 */
	public boolean addGoodsToCart(Shoppingcart shoppingcart);

	/**
	 * 更新商品数量 (?????)
	 * @param goodsNumInCart
	 * @return
	 */
	public boolean updateGoodsNum(Shoppingcart shoppingcart);

	/**
	 * 购物车删除商品
	 * @param gooodsId
	 * @return
	 */
	public boolean removeGoods(Shoppingcart shoppingcart);
	
	/**
	 * 根据user查询购物车
	 * @param users
	 * @return
	 */
	public List<Shoppingcart> findCartByUser(String userId);
	
}
