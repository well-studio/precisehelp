package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Users;

/**
 * 收藏业务接口
 * @author huhong
 *
 */
public interface IFavoriteService {
	/**
	 * 添加商品
	 * @param goods
	 * @return
	 */
	public boolean addGoods(Goodsinfo goods);

	/**
	 * 根据id删除商品信息
	 * @param goodsId
	 * @return
	 */
	public boolean removeGoods(int goodsId);

	/**
	 * 根据用户查询商品信息
	 * @param users
	 * @return
	 */
	public List<Goodsinfo> findGoodsByUser(Users users);
}
