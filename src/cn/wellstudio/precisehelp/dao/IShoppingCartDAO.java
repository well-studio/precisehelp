package cn.wellstudio.precisehelp.dao;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Shoppingcart;
import cn.wellstudio.precisehelp.entity.Users;

public interface IShoppingCartDAO {
	public List<Shoppingcart> userShoppingcartQuery(Users user);
}
