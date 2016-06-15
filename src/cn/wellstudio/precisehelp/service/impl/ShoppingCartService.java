package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IShoppingCartDAO;
import cn.wellstudio.precisehelp.dao.factory.DaoFactory;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Shoppingcart;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IShoppingCartService;

/**
 * 购物车业务实现
 * @author huhong
 *
 */
public class ShoppingCartService implements IShoppingCartService{

	
	IShoppingCartDAO shoppingCartDao;
	public void setShoppingCartDao(IShoppingCartDAO shoppingCartDao) {
		this.shoppingCartDao = shoppingCartDao;
	}
	
	public boolean addGoodsToCart(Goodsinfo goods) {
		
		boolean res = shoppingCartDao.addGoodsToCart(goods);
		
		return res;
	}


	public boolean removeGoods(int gooodsId) {
		
		boolean res = shoppingCartDao.removeGoods(gooodsId);
		
		return res;
	}

	public boolean updateGoodsNum(String goodsNumInCart) {
		
		boolean res = shoppingCartDao.updateGoodsNum(goodsNumInCart);
		
		return res;
	}

	@Override
	public List<Shoppingcart> findCartByUser(Users users) {
		
		List<Shoppingcart> cartList = shoppingCartDao.findCartByUser(users);
		
		return cartList;
	}

}
