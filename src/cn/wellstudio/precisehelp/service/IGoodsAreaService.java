package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodsarea;

/**
 * 商品产地接口设计
 * @author huhong
 *
 */
public interface IGoodsAreaService {
	/**
	 * 添加商品产地
	 * @param goods
	 * @return
	 */
	public boolean addArea(Goodsarea goods);
	
	/**
	 * 更新商品产地
	 * @param goods
	 * @return
	 */
	public boolean updateArea(Goodsarea goods);
	
	/**
	 * 删除商品产地
	 * @param goods
	 * @return
	 */
	public boolean removeArea(Goodsarea goods);
	
	/**
	 * 查询全部商品产地
	 * @return
	 */
	public List<Goodsarea> findAllArea();
	
	/**
	 * 根据id查询商品产地
	 * @param goodsId
	 * @return
	 */
	public Goodsarea findAreaById(int goodsId);
	
	/**
	 * 根据名称查询商品产地
	 * @param goodsName
	 * @return
	 */
	public Goodsarea findAreaByName(String goodsName);
}
