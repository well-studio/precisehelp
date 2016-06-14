package cn.wellstudio.precisehelp.dao.impl;

import java.util.List;

import cn.wellstudio.precisehelp.dao.IUsersFavoriteDAO;
import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Users;
import cn.wellstudio.precisehelp.util.Operation;

/** 
 * 用户收藏夹管理
 * @author xxmodd 
 */
public class UsersFavoriteManage extends ObjectManage implements IUsersFavoriteDAO{

	//用户查询收藏的商品
	@SuppressWarnings("unchecked")
	public List<Goodsinfo> favoriteQuery(Users users){
		 List<Goodsinfo> favoriteList= null;
		 String hql = "select uf.goodsinfo from Usersfavorite as uf where uf.users.userId = ?";
		 favoriteList = Operation.hqlQuery(hql, users.getUserId());	 
		 return favoriteList;
	}
	
	
}
