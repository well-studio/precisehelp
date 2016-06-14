package cn.wellstudio.precisehelp.service.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.factory.DaoFactory;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Shoppingcart;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.service.IShoppingCartService;

public class ShoppingCartService implements IShoppingCartService{

	public boolean addGoodsToCart(Goodsinfo goods) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Shoppingcart> findCartByUser(Users users) {
		List<Shoppingcart> cartList = DaoFactory.getShoppingCart().userShoppingcartQuery(users);
		return cartList;
	}

	public boolean removeGoods(int gooodsId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateGoodsNum(String goodsNumInCart) {
		// TODO Auto-generated method stub
		return false;
	}

}
