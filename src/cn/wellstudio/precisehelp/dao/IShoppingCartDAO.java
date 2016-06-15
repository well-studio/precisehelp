package cn.wellstudio.precisehelp.dao;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Shoppingcart;
import cn.wellstudio.precisehelp.entity.Users;

/**
 * 购物车DAO接口设计
 * @author huhong
 *
 */
public interface IShoppingCartDAO {
	/**
	 * 添加商品进入购物车
	 * @param goods
	 * @return
	 */
	public boolean addGoodsToCart(Goodsinfo goods);

	/**
	 * 更新商品数量 (?????)
	 * @param goodsNumInCart
	 * @return
	 */
	public boolean updateGoodsNum(String goodsNumInCart);

	/**
	 * 购物车删除商品
	 * @param gooodsId
	 * @return
	 */
	public boolean removeGoods(int gooodsId);
	
	/**
	 * 根据user查询购物车
	 * @param users
	 * @return
	 */
	public List<Shoppingcart> findCartByUser(Users users);
}
