package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodsinfo;

/**
 * 商品业务接口
 * @author huhong
 *
 */
public interface IGoodsService {
	/**
	 * 查询全部商品
	 * @return
	 */
	public List<Goodsinfo> findAllGoods();
	
	
	/**
	 * 根据商品id查询商品信息
	 * @param goodId
	 * @return
	 */
	public Goodsinfo findGoodsById(String goodId);
	
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
	public List<Goodsinfo> findGoodsByType(Integer goodType);
	
	/**
	 * 根据地区查询商品信息
	 * @param goodArea
	 * @return
	 */
	public List<Goodsinfo> findGoodsByArea(Integer goodArea);
	
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
