package cn.wellstudio.precisehelp.service;

import java.util.List;

import cn.wellstudio.precisehelp.entity.Goodstype;

/**
 * 商品类型业务接口
 * @author huhong
 *
 */
public interface IGoodsTypeService {
	/**
	 * 添加商品类型
	 * @param goods
	 * @return
	 */
	public boolean addType(Goodstype goods);
	
	/**
	 * 更新商品类型
	 * @param goods
	 * @return
	 */
	public boolean updateType(Goodstype goods);
	
	/**
	 * 删除商品类型
	 * @param goods
	 * @return
	 */
	public boolean removeType(Goodstype goods);
	
	/**
	 * 查询全部商品种类
	 * @return
	 */
	public List<Goodstype> findAllType();
	
	/**
	 * 根据商品id查询商品类型
	 * @param goodsId
	 * @return
	 */
	public Goodstype findTypeById(int goodsId);
	
	/**
	 * 根据名称查询商品类型
	 * @param goodsName
	 * @return
	 */
	public Goodstype findTypeByName(String goodsName);

}
