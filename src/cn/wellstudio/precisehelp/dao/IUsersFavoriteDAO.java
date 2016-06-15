package cn.wellstudio.precisehelp.dao;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodsinfo;
import cn.wellstudio.precisehelp.entity.Users;

/**
 * 收藏夹DAO接口设计
 * @author huhong
 *
 */
public interface IUsersFavoriteDAO {
	
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
