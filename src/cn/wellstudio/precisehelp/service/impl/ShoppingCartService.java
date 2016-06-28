package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IShoppingCartDAO;
import cn.wellstudio.precisehelp.entity.Shoppingcart;
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
	
	public boolean addGoodsToCart(Shoppingcart shoppingcart) {
		
		boolean res = shoppingCartDao.addGoodsToCart(shoppingcart);
		
		return res;
	}


	public boolean removeGoods(Shoppingcart shoppingcart) {
		
		boolean res = shoppingCartDao.removeGoods(shoppingcart);
		
		return res;
	}

	public boolean updateGoodsNum(Shoppingcart shoppingcart) {
		
		boolean res = shoppingCartDao.updateGoodsNum(shoppingcart);
		
		return res;
	}

	@Override
	public List<Shoppingcart> findCartByUser(String userId) {
		
		List<Shoppingcart> cartList = shoppingCartDao.findCartByUser(userId);
		
		return cartList;
	}

}
