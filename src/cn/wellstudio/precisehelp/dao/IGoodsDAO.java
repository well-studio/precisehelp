package cn.wellstudio.precisehelp.dao;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodsinfo;

/**
 * 商品接口设计
 * @author huhong
 *
 */
public interface IGoodsDAO {
	
	/**
	 * 查询全部商品
	 * @return
	 */
	public List<Goodsinfo> findAllGoods();
	
	/**
	 * 根据名称查询商品信息
	 * @param goodName
	 * @return
	 */
	public List<Goodsinfo> findGoodsByName(String goodName);
	
	/**
	 * 根据商品类型查询商品信息
	 * @param goodType
	 * @return
	 */
	public List<Goodsinfo> findGoodsByType(String goodType);
	
	/**
	 * 根据地区查询商品信息
	 * @param goodArea
	 * @return
	 */
	public List<Goodsinfo> findGoodsByArea(String goodArea);
	
	/**
	 * 添加商品
	 * @param goodsInfo
	 * @param goodsArea
	 * @return
	 */
	public  boolean createGoods(Goodsinfo goodsInfo);

	/**
	 * 更新商品信息
	 * @param goodsInfo
	 * @param goodsArea
	 * @return
	 */
	public boolean updateGoods(Goodsinfo goodsInfo);
	
}
