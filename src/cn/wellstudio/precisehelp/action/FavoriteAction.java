package cn.wellstudio.precisehelp.action;

import cn.wellstudio.precisehelp.service.IFavoriteService;

import com.opensymphony.xwork2.ActionSupport;

public class FavoriteAction extends ActionSupport{
	
	IFavoriteService favoriteService;
	public void setFavoriteService(IFavoriteService favoriteService) {
		this.favoriteService = favoriteService;
	}
	
	/**
	 * 添加商品进入收藏夹
	 * @return
	 */
	public String addGoods() {
		
		return null;
	}
	
	/**
	 * 用户收藏夹中移除商品
	 * @return
	 */
	public String removeGoods() {
		
		return null;
	}
	
	/**
	 * 根据用户查询收藏夹商品信息
	 * @return
	 */
	public String findGoodsByUser() {
		
		return null;
	}
}
